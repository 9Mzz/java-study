package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
		
//		정수형관리 순서대로 출력하지 않음
		Integer i01 = new Integer(3);
		Integer i02 = new Integer(24);
		Integer i03 = new Integer(7);
		int i04 = 100;
		Integer i05 = new Integer(5);
		Integer i06 = new Integer(6);
		
		Set<Integer> iSet = new HashSet<Integer>();
//		숫자형을 쓰고 싶어 int 를 쓰면 에러 -> Integer 로 써야 올바른 문법
		
		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);
		iSet.add(i04); //자동박싱 warp
		
		
		iSet.remove(i03);
		
		
		System.out.println("iSet갯수: " + iSet.size());
		
		for (Integer no : iSet) {
			System.out.println(no.toString());
		}
		
//		향상된 for 문 
		for (Integer no: iSet) {
			System.out.println(no.toString());
		}
//		for (int i=0; i<3; i++) {		}
		
		System.out.println("----------------------------");
		
//		Point관리
		Point p01 = new Point(3, 13);
		Point p02 = new Point(2, 34);
		Point p03 = new Point(7, 71);
		Point p04 = new Point(3, 13);
		
		Set<Point> pSet = new HashSet <Point>();
		
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		pSet.add(p04);
		
		System.out.println("pSet갯수: " + pSet.size());
		System.out.println(pSet.toString());
		
		
		for (Point i : pSet) {
			System.out.println(i.getX());
		}
		
	}

}
