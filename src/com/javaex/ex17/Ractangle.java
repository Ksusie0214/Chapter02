package com.javaex.ex17;

public class Ractangle {
	
	//필드
	private int width;
	private int height;
	private String lineColor;
	private String fillColor;
	//생성자
	public Ractangle() {
		
	}
	
	public Ractangle(int width, int height, String lineColor, String fillColor) {
		super();
		this.width = width;
		this.height = height;
		this.lineColor = lineColor;
		this.fillColor = fillColor;
	}


	//메소드 g/s
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	//메소드 일반
	
	
	

}
