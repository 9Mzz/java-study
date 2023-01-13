package com.javaex.ex01;

public class Customer extends Person{
	
	
//	필드 cNo 고객번호 point 포인트점수
	private int cNo;
	private int point;
	
	
//	public Person() {}

	public Customer(String name, String hp, int cNo, int point) {
		super(name, hp);
		this.cNo = cNo;
		this.point = point;
	}


	public final int getcNo() {
		return cNo;
	}


	public final void setcNo(int cNo) {
		this.cNo = cNo;
	}


	public final int getPoint() {
		return point;
	}


	public final void setPoint(int point) {
		this.point = point;
	}

	
	
	public void showInfo() {
		System.out.println("#이름 :"+super.getName()+", #핸드폰 :"+super.getHp()+", #고객번호 :"+cNo+", #포인트점수:"+point);
	}
	
	
	
}
