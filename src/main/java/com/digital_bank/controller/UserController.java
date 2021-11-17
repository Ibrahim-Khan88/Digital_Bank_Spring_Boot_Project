package com.digital_bank.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.digital_bank.model.User;
import com.digital_bank.service.UserService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;


@CrossOrigin("*")
@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/api/v1/account/balance/{identifier}")
	ResponseEntity<User> searchByKeyWord(@PathVariable("identifier") String identifier)
			throws JsonParseException, JsonMappingException, IOException {

		User user = userService.fetchUser(identifier);

		return ResponseEntity.ok().body(user);
	}

	
}
