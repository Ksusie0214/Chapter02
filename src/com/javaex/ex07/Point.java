package com.javaex.ex07;

public class Point {
	//필드
	private int x;
	private int y;
	//생성자
	public Point() {
		//메모리에 올리는 일
		System.out.println("Point()");
	}
	
	public Point(int x, int y) {
		//메모리에 올리는 일
		this.x = x;
		this.y = y;
		System.out.println("Point(int x)");
	}
	
	
	//메소드 -g/s
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	//메소드 -일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	public void draw(boolean action) {
		if(action==true) {System.out.println("점"+"[x=" + x + ", y=" + y + "]"+"을 그렸습니다.");}
		else {System.out.println("점"+"[x=" + x + ", y=" + y + "]"+"을 지웠습니다.");}
	
	}
}
