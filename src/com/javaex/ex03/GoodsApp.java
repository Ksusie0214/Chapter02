package com.javaex.ex03;

public class GoodsApp {
	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		
		//camera.name = "니콘";		private 캡슐화
		//camera.price = 400000;	private 캡슐화
		
		//System.out.println(camera.name);
		//System.out.println(camera.price);
		
		System.out.println(camera.getName());
		System.out.println(camera.getPrice());
		
		
	}

}
