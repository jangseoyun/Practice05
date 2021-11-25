package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		//수정하지말것
		Goods camera = new Goods();
		Goods cup = new Goods("머그컵", 2000);
		
		camera.setName("니콘");
		camera.setPrice(40000);
		
		camera.showinfo();
		cup.showinfo();
		
	}

}


