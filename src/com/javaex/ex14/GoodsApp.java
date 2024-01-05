package com.javaex.ex14;

public class GoodsApp {
	public static void main(String[] args) {
		//배열만들기
		Goods[] goodsArray = new Goods[5];
		
		Goods camera = new Goods("니콘", 400000);
		//System.out.println(camera.toString());	
		
		Goods computer = new Goods("LG그램", 900000);
		//System.out.println(computer.toString());
		
		Goods cup = new Goods("머그컵", 20000);
		//System.out.println(cup.toString());
		
		goodsArray[0] = camera;
		goodsArray[1] = computer;
		goodsArray[2] = cup;
		
		System.out.println(goodsArray[0].getName());
		System.out.println(camera.getName());
		int count = 0;
		for(int i = 0; i<goodsArray.length; i++) {
			if(goodsArray[i]!=null) {
				goodsArray[i].showinfo();
				count = count+1;
			}
			
		}
		System.out.println("전체 상품갯수: "+ count);
		
		
	}
}
