package com.javaex.ex04;

public class Employee extends User {

//	필드
	private int salary; //급여

//	생성자 컨스트럭터
	public Employee() {	}
	
	public Employee(String id, String password, String name, int salary) {
		super(id, password, name);
		/*
		super.getId();
		super.getPassword();
		super.getName();
		*/
		this.salary = salary;
	}

//	메서드 gs
	public int getsalary() {
		return salary;
	}

	public void setsalary(int salary) {
		this.salary = salary;
	}
	
	
	
//	메서드 일반
	public void showInfo() {
//		아이디 패스워드 이름 월급 순서 출력
		System.out.println("아이디:"+super.getId()+" 비번:"+super.getPassword()+" 이름:"+super.getName()+" 월급:"+salary);
	}

	
}
