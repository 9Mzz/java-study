package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {			
//		equals를 파보자
		
		
		/* 내코드
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = new Point(50,870);
		
		Point d = c;
		
		System.out.println(a==b);
//		a b 의 주소를 비교 new 로 새로 올리니까 같을 수가 없다
		
		System.out.println(d==c);
//		d와 c는 같은 것으로 지정 되어서 같다
		
		System.out.println("------------------------");
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		*/
		
		
//		일영샘의 코드
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = new Point(100, 139);
		
		Point d = c;
		
		System.out.println(a==b);
		System.out.println(d==c);

		System.out.println("=======================");
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		
		
	}

}
