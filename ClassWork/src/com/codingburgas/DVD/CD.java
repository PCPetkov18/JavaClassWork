package com.codingburgas.DVD;

public class CD {
	
	private String artist;
	private int numberOfTracks;
		
		

		public String getArtist() {
			return artist;
		}
	
		public int getNumberOfTrack() {
			return numberOfTracks;
		}
	
		public void setArtist(String artist) {
			this.artist = artist;
		}
	
		public void setNumberOfTrack(int numberOfTracks) {
			this.numberOfTracks = numberOfTracks;
		}
	
		public void print() {
			System.out.println(getArtist() + getNumberOfTrack());
		}	
}