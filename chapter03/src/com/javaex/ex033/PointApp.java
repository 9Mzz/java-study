package com.javaex.ex033;

public class PointApp {

	public static void main(String[] args) {
		
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