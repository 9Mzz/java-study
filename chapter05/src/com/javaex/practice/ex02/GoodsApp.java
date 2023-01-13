package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {

//	아래 내용 수정없이 Goods.java 를 수정하여 에러 고칠것 
	Goods camera = new Goods ();
	Goods cup = new Goods ("머그컵", 2000);
	
	camera.setName("니콘");
	camera.setPrice(400000);
	
	camera.showInfo();
	cup.showInfo();
	
	
	
	}

}


