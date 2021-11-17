package com.digital_bank.service;

import java.util.Objects;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digital_bank.model.Content;
import com.digital_bank.model.Money;
import com.digital_bank.model.MoneyResponse;
import com.digital_bank.model.User;
import com.digital_bank.repository.TransactionRepository;
import com.digital_bank.repository.UserRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Service
public class MoneyService {

	@Autowired
	public TransactionRepository transactionRepository;

	@Autowired
	public UserRepository userRepository;

	public MoneyResponse Money(Money moneyObject) throws JsonMappingException, JsonProcessingException {

		String tnx, transactionType = "";
		User fromAcc = userRepository.findByIdentifier(moneyObject.getFromAc());
		User toAcc = userRepository.findByIdentifier(moneyObject.getToAc());

		// checking both of the account is present or not
		if (!Objects.isNull(fromAcc) && !Objects.isNull(toAcc)) {

			// checking sufficient balance of sender
			if (fromAcc.getBalance() >= moneyObject.getAmount()) {

				// checking which type of operation
				if (moneyObject.getTransactionType().getTxnCode() == 1201)
					transactionType = "Send Money";
				else if (moneyObject.getTransactionType().getTxnCode() == 1202)
					transactionType = "Payment";
				else if (moneyObject.getTransactionType().getTxnCode() == 103)
					transactionType = "Add Money";

				// updating balance
				fromAcc.setBalance(fromAcc.getBalance() - moneyObject.getAmount());
				toAcc.setBalance(toAcc.getBalance() + moneyObject.getAmount());

				userRepository.save(fromAcc);
				userRepository.save(toAcc);

				// getting unique transactionId
				while (true) {
					tnx = generateRandomTnx();
					Content contentTest = transactionRepository.findBytxnId(tnx);
					if (contentTest == null) {
						break;
					}
				}

				// for sender transaction
				Content contentForFromAcc = new Content(tnx, -moneyObject.getAmount(), moneyObject.getDescription(),
						moneyObject.getNote(), moneyObject.getReferenceId(), moneyObject.getChannel(),
						moneyObject.getToAc(), transactionType, moneyObject.getData().getReason(),
						java.time.LocalDateTime.now().toString());
				contentForFromAcc.setUser(fromAcc);
				transactionRepository.save(contentForFromAcc);

				// for receiver transaction
				Content contentForToAcc = new Content(tnx, moneyObject.getAmount(), moneyObject.getDescription(),
						moneyObject.getNote(), moneyObject.getReferenceId(), moneyObject.getChannel(),
						moneyObject.getFromAc(), transactionType, moneyObject.getData().getReason(),
						java.time.LocalDateTime.now().toString());
				contentForToAcc.setUser(toAcc);
				transactionRepository.save(contentForToAcc);

				// creating response object
				MoneyResponse moneyResponse = new MoneyResponse("PROCESSED", " ", " ", " ", moneyObject.getFromAc(),
						moneyObject.getToAc(), fromAcc.getName(), toAcc.getName(), fromAcc.getBalance(),
						toAcc.getBalance(), tnx);

				return moneyResponse;
			}
		}

		return null;

	}

	public static String generateRandomTnx() {
		int len = 10;
		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
		return sb.toString();
	}

}
