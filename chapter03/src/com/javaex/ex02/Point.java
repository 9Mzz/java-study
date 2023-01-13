package com.javaex.ex02;

public class Point {

	private int x;
	private int y;
	
	
	
	public Point() {
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
	/*
	@Override
	public boolean equals(Object obj) { //object는 자료형
//		여기에 써야 할 내용은 원본과 비교대상이 같은가 a.x==b.x && a.y==b.y 
//		아래와 같이 Point 다운 캐스팅 해서 써야함 (시야가 좁으니까 넓혀주기) 
		Point p = (Point)obj;
		
//		아래대신 써도됨 if (this.x == ((Point)obj).x && this.y==((Point)obj).y) {
		
		System.out.println("a.x="+ this.x);
		System.out.println("a.y="+ this.y);
		System.out.println("b.x="+ p.x);
		System.out.println("b.x="+ p.x);
		
		if (this.x == p.y && this.y==p.y) {
			return true;
		} else {
			return false;
		}
	}
	
	
		*/
		
	
//		일영샘의 코드
		@Override
		public boolean equals(Object obj) {
			Point p =(Point)obj;   //Object 다운캐스팅
			// a.x==b.x &&  a.y==b.y
			
			/*
			System.out.println("a.x=" + this.x);
			System.out.println("a.y=" + this.y);
			
			System.out.println("b.x=" + p.x);
			System.out.println("b.y=" + p.y);
			*/
			
			if(this.x==p.x  && this.y==p.y) {
				return true;
			}else {
				return false;
			}
		}
		
		
		
		

	
	
	

}
