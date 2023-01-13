package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p00 = new Point(2,3);
		Point p01 = new Point(6,3);
		Point p02 = new Point(5,8);
		
		Point p04 = p02;
		
		System.out.println("#getClass()");
		System.out.println(p00.getClass());
		System.out.println(p01.getClass());
		System.out.println(p02.getClass());
		System.out.println("------------------------------");		
		
		System.out.println("#hashCode()");
		System.out.println(p00.hashCode());
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		System.out.println("------------------------------");
		
		System.out.println("#ToString()");
		System.out.println(p00.toString());
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		System.out.println("------------------------------");		
		
		
//		헷깔림 개념 잘 잡자.
		System.out.println("#equals()");
//		값이 같은가
		System.out.println(p00.equals(p02));
		System.out.println(p00.equals(p01));
//		(대부분)메모리에 올라간 주소 가 같은가
//		보통 같기 어려우나 같은 것을 지목하는 변수가 같은 경우가 있음
		System.out.println(p00==p01);
		System.out.println(p02==p04);
		
		
		
		
	}

}
