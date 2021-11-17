package com.digital_bank.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Content {

	@Id
	@GeneratedValue
	private int Id;

	private String txnId;

	private double amount;
	private String description;
	private String note;
	private String referenceID;
	private String channel;
	private String remoteAccount;
	private String txnType;
	private String data;
	private String txnTime;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	private User user;

	public Content() {

	}

	public Content(String txnId, double amount, String description, String note, String referenceID, String channel,
			String remoteAccount, String txnType, String data, String txnTime) {

		this.txnId = txnId;
		this.amount = amount;
		this.description = description;
		this.note = note;
		this.referenceID = referenceID;
		this.channel = channel;
		this.remoteAccount = remoteAccount;
		this.txnType = txnType;
		this.data = data;
		this.txnTime = txnTime;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getReferenceID() {
		return referenceID;
	}

	public void setReferenceID(String referenceID) {
		this.referenceID = referenceID;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getRemoteAccount() {
		return remoteAccount;
	}

	public void setRemoteAccount(String remoteAccount) {
		this.remoteAccount = remoteAccount;
	}

	public String getTxnType() {
		return txnType;
	}

	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getTxnTime() {
		return txnTime;
	}

	public void setTxnTime(String txnTime) {
		this.txnTime = txnTime;
	}

}
