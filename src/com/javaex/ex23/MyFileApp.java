package com.javaex.ex23;

public class MyFileApp {
	public static void main(String[] args) {
		
		Myfile mf = new Myfile();
		
		String str = mf.read("c:/aaa.txt");
		System.out.println(str);
		
		
		
	}
}
