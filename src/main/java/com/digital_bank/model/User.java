package com.digital_bank.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
public class User {

	@NotBlank
	@Size(max = 50)
	String name;

	int balance;

	@NotBlank
	@Size(max = 50)
	String password;

	@Id
	@NotBlank
	@Size(max = 50)
	String identifier;

	@NotBlank
	@Size(max = 50)
	String address;

	public User() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", balance=" + balance + ", password=" + password + ", identifier=" + identifier
				+ ", address=" + address + "]";
	}

}
