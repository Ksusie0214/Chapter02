package com.javaex.ex05;

public class Song {
	
	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private String track;
	
	//생성자
	//메소드 -gs
	public void setTitle(String title) {
		this.title=title;
	}
	public void setArtist(String artist) {
		this.artist=artist;
	}
	public void setAlbum(String album) {
		this.album=album;
	}
	public void setComposer(String composer) {
		this.composer=composer;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public String getAlbum() {
		return album;
	}
	public String getComposer() {
		return composer;
	}
	public int getYear() {
		return year;
	}
	public String getTrack() {
		return track;
	}
	//메소드	 -일반
	public void showinfo() {
		System.out.println("==================================================================================================");
		System.out.println(this.artist+", "+this.title+" ( "+this.album+", "+this.year+", "+this.track+", "+this.composer+")");
		System.out.println("==================================================================================================");
	}
	
	

}
