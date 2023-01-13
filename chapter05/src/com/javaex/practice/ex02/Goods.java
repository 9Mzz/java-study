package com.javaex.ex02;

public class Goods {

//	필드
	private String name;
	private int price;
	
	
//	생성자
//	기본 생성자를 추가하여 에러를 수정했다
	public Goods() {
	}
	
	public Goods (String name, int price) {
		
		this.name = name;
		this.price = price;
	}	
	
	
//	매서드 g/s
	public String getName() {
		return name;
	}
	
//	private -> public 으로 고쳤다
	public void setName (String name) {
		this.name = name;
	}
	
	public int getPrice () {
		return price;
	}
		
	public void setPrice (int price) {
		this.price = price;
	}
	
	
	
//	매서드 일반
	public void showInfo() {
		System.out.println("상품명:" +name+",가격:"+price);
	}
	
}




