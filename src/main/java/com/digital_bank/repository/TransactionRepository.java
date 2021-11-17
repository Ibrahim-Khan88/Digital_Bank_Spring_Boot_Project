package com.digital_bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digital_bank.model.Content;
import com.digital_bank.model.User;

public interface TransactionRepository extends JpaRepository<Content, String> {

	List<Content> findByUserIdentifier(String Identifier);
	
	Content findBytxnId(String txnId);
	
}