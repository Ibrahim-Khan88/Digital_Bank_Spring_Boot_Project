package com.digital_bank.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digital_bank.model.Transaction;
import com.digital_bank.repository.TransactionRepository;
import com.digital_bank.repository.UserRepository;
import com.digital_bank.service.TransactionService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@CrossOrigin("*")
@RestController
public class TransactionController {

	@Autowired
	private TransactionService transactionService;

	@Autowired
	public TransactionRepository transactionRepository;

	@Autowired
	public UserRepository userRepository;

	@GetMapping("api/v1/account/statement")
	ResponseEntity<Transaction> fetchTransaction(@RequestParam String account, @RequestParam int page,
			@RequestParam int size) throws JsonParseException, JsonMappingException, IOException {

		Transaction resutl = transactionService.fetchTransactions(account, page, size);

		return ResponseEntity.ok().body(resutl);
	}

}
