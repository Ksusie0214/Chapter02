package com.javaex.ex21;

public class ShapeApp {

	public static void main(String[] args) {
		
		//Drawable 배열만들기
		Drawable[] dArray = new Drawable[4];
		
		//그릴 수 있는 애 Drawable
		Drawable d01 = new Ractangle(100, 100, "빨강", "빨강");
		
		Drawable d02 = new Point(2,2);
		
		Drawable d03 = new Circle(5,"초록", "보라");
		
		Drawable d04 = new Triangle(6, 8, "파랑", "노랑");
		
		dArray[0] = d01;
		dArray[1] = d02;
		dArray[2] = d03;
		dArray[3] = d04;
		
		for(int i = 0; i<dArray.length; i++) {
			dArray[i].draw();
		}
				
		
		
	}

}