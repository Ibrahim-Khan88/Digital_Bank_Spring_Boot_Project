package com.digital_bank.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digital_bank.model.User;
import com.digital_bank.repository.UserRepository;



@Service
public class UserService {

	
	@Autowired
	private UserRepository userRepository;
	
	public User fetchUser(String identifier) {

		User user = userRepository.findByIdentifier(identifier);
		
		if (!Objects.isNull(user)) {
			user.setPassword("");
			return user;
		}
		return null;
				
	}
	
}
