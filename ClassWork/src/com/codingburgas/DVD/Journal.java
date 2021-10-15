package com.codingburgas.DVD;

public class Journal {
	private int isbn;
	private String type;
	
		public int getIsbn() {
			return isbn;
		}
	
		public String getType() {
			return type;
			
		}
		
		public void setVolume(int isbn) {
			this.isbn = isbn;
		}
		
		public void setType(String type) {
			this.type = type;
		}
}