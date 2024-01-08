package com.javaex.ex16;

public class ColorPoint extends Point{
	//필드
	private String ColorPoint;
	
	
	//생성자
	public ColorPoint(String ColorPoint) {
		super();
		this.ColorPoint = ColorPoint;
	}
	public ColorPoint(int x, int y, String ColorPoint) {
		super(x,y);
		this.ColorPoint = ColorPoint;
	}
	
	
	//메소드 g/s
	public String getColorPoint() {
		return ColorPoint;
	}
	public void setColorPoint(String colorPoint) {
		ColorPoint = ColorPoint;
	}
	
	
	//메소드 일반
	
	@Override
	public String toString() {
		return "ColorPoint [ColorPoint=" + ColorPoint + "]";
	}
	
	public void showInfo() {
		System.out.println("[x값: "+super.getX()+" y값: "+super.getY()+" 색상: "+ColorPoint+"]");
	}
	

}
