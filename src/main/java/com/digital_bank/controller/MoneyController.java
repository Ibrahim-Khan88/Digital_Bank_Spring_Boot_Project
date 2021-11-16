package com.digital_bank.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.digital_bank.model.Money;
import com.digital_bank.model.MoneyResponse;
import com.digital_bank.service.MoneyService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@CrossOrigin("*")
@RestController
public class MoneyController {

	@Autowired
	private MoneyService moneyService;

	@PostMapping("/api/v1/txn")
	ResponseEntity<MoneyResponse> searchByKeyWord(@RequestBody Money sendMoneyObject)
			throws JsonParseException, JsonMappingException, IOException {

		MoneyResponse resutl = moneyService.Money(sendMoneyObject);

		return ResponseEntity.ok().body(resutl);
	}

}
