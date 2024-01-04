package com.javaex.ex07;

public class PointApp {

	public static void main(String[] args) {
		
		Point p0 = new Point();
		p0.setX(5);
		p0.setY(5);
		System.out.println(p0.toString());
		
		Point p1 = new Point(10, 23);
		System.out.println(p1.toString());
		
		p0.draw();
		p1.draw();
		p0.erase();
		p1.erase();
	}

}
