package com.javaex.ex04;

public class Customer extends User {

//	필드
	private int point; //포인트

//	생성자 컨스트럭터
	public Customer() {	}
	
	public Customer(String id, String password, String name, int point) {
		super(id, password, name);
		/* 내가 왜 여기서 super.get 을 쓴건가... 허약한 문법력 반성.
		super.getId();  
		super.getPassword();
		super.getName();
		*/
		this.point = point;
	}

//	메서드 gs
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	
	
//	메서드 일반
	public void showInfo() {
//		아이디 패스워드 이름 포인트 순서 출력
		System.out.println("아이디:"+super.getId()+" 비번:"+super.getPassword()+" 이름:"+super.getName()+" 포인트:"+point);
	}


}
