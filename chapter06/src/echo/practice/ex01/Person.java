package com.javaex.ex01;

public class Person {
	
//	name 이름 hp 핸드폰
	private String name;
	private String hp;
	
	
//	생성자 컨스트럭터
	public Person() {	}
	
	public Person(String name, String hp) {
		super();
		this.name = name;
		this.hp = hp;
	}
	
	
//	메서드 gs
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getHp() {
		return hp;
	}
	public final void setHp(String hp) {
		this.hp = hp;
	}
	
	
//	메서드 일반
	@Override
	public String toString() {
		return "Person [name=" + name + ", hp=" + hp + "]";
	}
	
	
	public void showInfo() {
		System.out.println("#이름 :"+name+", #핸드폰 :"+hp);
//		System.out.println("#이름 :"+name+", #핸드폰 :"+hp+", #고객번호 :"+cNo+", #포인트점수:"+point);
	}
	
	
	
}
