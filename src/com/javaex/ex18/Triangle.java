package com.javaex.ex18;

public class Triangle extends Shape{
	//필드
	private int Twidth;
	private int Theight;
	
	
	//생성자
	public Triangle() {
		super();
	}

	public Triangle(int twidth, int theight, String fillColor, String lineColor) {
		super(fillColor, lineColor);
		this.Twidth = twidth;
		this.Theight = theight;
	}
	
	//메소드 g/s
	public int getTwidth() {
		return Twidth;
	}

	public void setTwidth(int twidth) {
		Twidth = twidth;
	}

	public int getTheight() {
		return Theight;
	}

	public void setTheight(int theight) {
		Theight = theight;
	}

	
	
	//메소드 일반
	@Override
	public String toString() {
		return "Triangle [Twidth=" + Twidth + ", Theight=" + Theight +" , fillColor=" + super.getFillColor() + ", lineColor=" + super.getLineColor() + "]";
	}
	
}
