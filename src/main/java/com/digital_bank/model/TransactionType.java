package com.digital_bank.model;

public class TransactionType{
	
	public int txnCode;

	public int getTxnCode() {
		return txnCode;
	}

	public void setTxnCode(int txnCode) {
		this.txnCode = txnCode;
	}

	@Override
	public String toString() {
		return "TransactionType [txnCode=" + txnCode + "]";
	}
	
	
	
}