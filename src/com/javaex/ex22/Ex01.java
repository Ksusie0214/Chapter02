package com.javaex.ex22;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		
		try {
			double result = 100/no;
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println(e.toString());
			System.out.println("0으로 나눌 수 없습니다.");
		}finally {
			System.out.println("finally 영역");
		}
		
		
		
		sc.close();
	}

}
