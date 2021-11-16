package com.digital_bank.model;

public class MoneyResponse {

	private String status;
	private String description;
	private String errorCode;
	private String message;
	private String fromAC;
	private String toAC;
	private String fromName;
	private String toName;
	private int fromBalance;
	private int toBalance;
	private String txnId;

	public MoneyResponse(String status, String description, String errorCode, String message, String fromAC,
			String toAC, String fromName, String toName, int fromBalance, int toBalance, String txnId) {
		super();
		this.status = status;
		this.description = description;
		this.errorCode = errorCode;
		this.message = message;
		this.fromAC = fromAC;
		this.toAC = toAC;
		this.fromName = fromName;
		this.toName = toName;
		this.fromBalance = fromBalance;
		this.toBalance = toBalance;
		this.txnId = txnId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getFromAC() {
		return fromAC;
	}

	public void setFromAC(String fromAC) {
		this.fromAC = fromAC;
	}

	public String getToAC() {
		return toAC;
	}

	public void setToAC(String toAC) {
		this.toAC = toAC;
	}

	public String getFromName() {
		return fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	public String getToName() {
		return toName;
	}

	public void setToName(String toName) {
		this.toName = toName;
	}

	public int getFromBalance() {
		return fromBalance;
	}

	public void setFromBalance(int fromBalance) {
		this.fromBalance = fromBalance;
	}

	public int getToBalance() {
		return toBalance;
	}

	public void setToBalance(int toBalance) {
		this.toBalance = toBalance;
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

}
