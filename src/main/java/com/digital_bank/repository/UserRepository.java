package com.digital_bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digital_bank.model.User;



public interface UserRepository extends JpaRepository<User, String> {

	User findByIdentifier(String Identifier);
}
