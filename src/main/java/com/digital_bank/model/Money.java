package com.digital_bank.model;

public class Money {

	private String fromAc;
	private String toAc;
	private int amount;
	private TransactionType transactionType;
	private String note;
	private String referenceId;
	private String tag;
	private Data data;
	private String description;
	private String channel;

	public Money() {
	}

	public Money(String fromAc, String toAc, int amount, TransactionType transactionType, String note,
			String referenceId, String tag, Data data, String description, String channel) {
		super();
		this.fromAc = fromAc;
		this.toAc = toAc;
		this.amount = amount;
		this.transactionType = transactionType;
		this.note = note;
		this.referenceId = referenceId;
		this.tag = tag;
		this.data = data;
		this.description = description;
		this.channel = channel;
	}

	public String getFromAc() {
		return fromAc;
	}

	public void setFromAc(String fromAc) {
		this.fromAc = fromAc;
	}

	public String getToAc() {
		return toAc;
	}

	public void setToAc(String toAc) {
		this.toAc = toAc;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	@Override
	public String toString() {
		return "SendMoney [fromAc=" + fromAc + ", toAc=" + toAc + ", amount=" + amount + ", transactionType="
				+ transactionType + ", note=" + note + ", referenceId=" + referenceId + ", tag=" + tag + ", data="
				+ data + ", description=" + description + ", channel=" + channel + "]";
	}

}
