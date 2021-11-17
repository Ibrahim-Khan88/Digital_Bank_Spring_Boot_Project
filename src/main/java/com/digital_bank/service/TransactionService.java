package com.digital_bank.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digital_bank.model.Content;
import com.digital_bank.model.Transaction;
import com.digital_bank.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	public TransactionRepository transactionRepository;

	public Transaction fetchTransactions(String identifier, int page, int size) {

		List<Content> contentList = transactionRepository.findByUserIdentifier(identifier);

		List<Content> first5ElementsList = new ArrayList<Content>();

		// taking element in reverse order and minimum value of between size and List
		for (int i = 1; i <= Math.min(size, contentList.size()); i++) {
			first5ElementsList.add(contentList.get(contentList.size() - i));
		}

		Transaction tranaction = new Transaction(true, 1, 5, 5, true, 5, 0, false);
		tranaction.setContent(first5ElementsList);

		return tranaction;
	}
}
