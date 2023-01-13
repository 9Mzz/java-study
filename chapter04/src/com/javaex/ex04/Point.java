package com.javaex.ex04;

import java.util.Objects;

public class Point {


	// 필드
	private int x;
	private int y;

	// 생성자
	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 메소드 gs
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

	// 메소드 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(x + y); // 해시값을 바꾼다. 원래 해시값-이퀄에서 비교하는 작업을 간편화
	}

	
	@Override
	public boolean equals (Object obj) {
		Point p = ((Point) obj);
		
		if (this.x == p.x && this.y == p.y) {
			return true; //리턴값을 비교해서 같으면 true
		} else {
			return false;
		}
		
	}


	
}
