package com.cafe24.springcontainer.videosystem;

public class DVDPlayer {
	private DigitalVideoDisc dvd;
	
	public DVDPlayer() {
	}
	
	public DVDPlayer(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}
	
	public void play() {
		dvd.play();
	}

	public void setDigitalVideoDisc(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}
	
	public void setDvd(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}
	
}
