package com.javaex.ex04;

public class User {
	
//	필드
	private String id; //아이디
	private String password; //패스워드
	private String name;  //이름

	
//	생성자 gs
	public User() {	}
	public User(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
	
//	메서드 gs
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
//	메서드 일반
	public void showInfo() {
		System.out.println(id+password+name);
	}
	
	
}
