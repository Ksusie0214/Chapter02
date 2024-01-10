package com.javaex.ex23;

public class Myfile {
	
	//필드
	
	//생성자
	
	//메소드 g/s
	
	//메소드 일반
	
	public String read(String path) {
		
		String result = "학교종이 땡땡땡 어서 모이자";
			
		return result;
		
		try {
			throw new IOException();
		}catch(IOException e) {
			System.out.println("파일이 없습니다.");
		}
		
		return result;
		
		
	}

}
