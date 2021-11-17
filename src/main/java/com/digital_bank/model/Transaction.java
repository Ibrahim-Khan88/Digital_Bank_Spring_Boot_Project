package com.digital_bank.model;

import java.util.List;

public class Transaction {

	private boolean last;
	private int totalPages;
	private int totalElements;
	private int numberOfElements;
	private boolean first;
	private int size;
	private int number;
	private boolean empty;

	public List<Content> content;

	public Transaction(boolean last, int totalPages, int totalElements, int numberOfElements, boolean first, int size,
			int number, boolean empty) {
		super();
		this.last = last;
		this.totalPages = totalPages;
		this.totalElements = totalElements;
		this.numberOfElements = numberOfElements;
		this.first = first;
		this.size = size;
		this.number = number;
		this.empty = empty;
	}

	public Transaction() {

	}

	public List<Content> getContent() {
		return content;
	}

	public void setContent(List<Content> content) {
		this.content = content;
	}

	public boolean isLast() {
		return last;
	}

	public void setLast(boolean last) {
		this.last = last;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(int totalElements) {
		this.totalElements = totalElements;
	}

	public int getNumberOfElements() {
		return numberOfElements;
	}

	public void setNumberOfElements(int numberOfElements) {
		this.numberOfElements = numberOfElements;
	}

	public boolean isFirst() {
		return first;
	}

	public void setFirst(boolean first) {
		this.first = first;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}

}
