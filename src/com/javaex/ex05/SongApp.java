package com.javaex.ex05;

public class SongApp {
	public static void main(String[] args) {
		//좋은날
		Song goodDay = new Song();
		goodDay.setTitle("좋은날");
		goodDay.setArtist("아이유");
		goodDay.setAlbum("Real");
		goodDay.setYear(2010);
		goodDay.setTrack("3번 트랙");
		goodDay.setComposer("이민수 작곡");
	
		goodDay.showinfo();
		
		//거짓말
		Song lie = new Song();
		lie.setTitle("거짓말");
		lie.setArtist("BIGBANG");
		lie.setAlbum("Always");
		lie.setYear(2007);
		lie.setTrack("2번 트랙");
		lie.setComposer("G-DRAGON 작곡");

		lie.showinfo();
		
		//벚꽃엔딩
		Song blossomEnding = new Song();
		blossomEnding.setTitle("벚꽃엔딩");
		blossomEnding.setArtist("버스커버스커");
		blossomEnding.setAlbum("버스커버스커 1집");
		blossomEnding.setYear(2012);
		blossomEnding.setTrack("4번 트랙");
		blossomEnding.setComposer("장범준 작곡");
		
		blossomEnding.showinfo();
		
		
		
	}

}
