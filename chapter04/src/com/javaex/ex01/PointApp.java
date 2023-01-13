package com.javaex.ex01;

public class PointApp {

	public static void main(String[] args) {
		Point p01 = new Point(6,3);
		Point p02 = new Point(10,15);
		
//		System.out.println(p01.toString());
//		System.out.println(p02.toString());
		
//	클래스명 변수명	= new 생성자
	PointList pList;	
	pList = new PointList();	
	
	
	pList.add(p01);
	pList.add(p02);
	
	System.out.println(pList.get(0).getX());
	System.out.println(pList.get(1).getY());
	
	
	Point p03 = new Point(150,125);	
	pList.add(p03);
	System.out.println(pList.get(2).getY());
	
	}

}
