package com.javaex.ex01;

import java.util.Arrays;

public class PointList {
//	책장 같이 책을 관리 하는 녀석 메소드 위주로 동작
	
	
	private Point[] pArray;  //배열
	private int crtPos; //숫자를 담는녀석

//	생성자
	public PointList() {	
		this.pArray = new Point[3];
		this.crtPos = 0;
	} //기본 생성자는 만들어주는게 좋다
	
// 평소 만들던 생성자는 내부에서 관리 하다보니 안넣는게 좋다.

	
//메서드 gs 안만드는게 좋다 	
	
	
//	메서드 일반
	public void add (Point p) {
		pArray[crtPos] = p;
		crtPos++;
	}
	
	public Point get (int index) {
		
		Point result = pArray[index];
		return result;
//		return pArray[index];
	}
	
	
	public int size () {
		return crtPos;
	}

	
	
	
	@Override
	public String toString() {
		return "PointList [pArray=" + Arrays.toString(pArray) + ", crtPos=" + crtPos + "]";
	}
	
	
	
	
	
	
}
