package com.javaex.ex16;

public class PointApp {
	public static void main(String[] args) {
		
		Point p = new Point(4,4);
		p.showInfo();
		
		
		ColorPoint p1 = new ColorPoint("red");
		p1.showInfo();
		
		ColorPoint p2 = new ColorPoint(4, 4, "blue");
		p2.showInfo();
		
		
		
	}

}
