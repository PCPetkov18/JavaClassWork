package com.codingburgas.DVD;

public class Book {
	private String athor;
	private int pages;
	private String publisher;
	private int MAX_BORROW_DATE = 14;
	
	
	
	public int getMAX_BORROW_DATE() {
		return MAX_BORROW_DATE;
	}
	public void setMAX_BORROW_DATE(int mAX_BORROW_DATE) {
		MAX_BORROW_DATE = mAX_BORROW_DATE;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getAthor() {
		return athor;
	}
	public void setAthor(String athor) {
		this.athor = athor;
	}
}