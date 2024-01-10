package com.javaex.ex18;

public class ShapeApp {
	public static void main(String[] args) {
		
		
		Ractangle[] rArray = new Ractangle[2];
		
		Ractangle r01 = new Ractangle();
		r01.setWidth(3);
		r01.setHeight(30);
		r01.setFillColor("빨강");
		r01.setLineColor("검정");
		Ractangle r02 = new Ractangle(7, 28, "노랑", "초록");
		//System.out.println(r02.toString());
		//System.out.println(r01.toString());
		
		Shape s01 = new Shape();
		s01.setFillColor("노랑");
		s01.setLineColor("검정");
		
		//System.out.println(s01.toString());
		
		Triangle t01 = new Triangle(6, 5, "파랑", "검정");
		Triangle t02 = new Triangle(10, 12, "초록", "주황");
		//System.out.println(t01.toString());
		//System.out.println(t02.toString());
		
		Circle c01 = new Circle(5, "빨강", "노랑");
		Circle c02 = new Circle(2, "보라", "군청");
		//System.out.println(c01.toString());
		//System.out.println(c02.toString());
		
		rArray[0] = r01;
		rArray[1] = r02;
		
		for(int i = 0; i<rArray.length; i++) {
			System.out.println(rArray[i].toString());
		}
		
	}

}
