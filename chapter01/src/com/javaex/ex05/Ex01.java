package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {
		/*
		int n01= (int)(Math.random()*45)+1;
		int n02= (int)(Math.random()*45)+1;
		int n03= (int)(Math.random()*45)+1;
		int n04= (int)(Math.random()*45)+1;
		int n05= (int)(Math.random()*45)+1;
		int n06= (int)(Math.random()*45)+1;
		*/
		
		/* 
		System.out.println(n01);
		System.out.println(n02);
		System.out.println(n03);
		System.out.println(n04);
		System.out.println(n05);
		System.out.println(n06);
		*/
		
		// 반복문 사용
		int i= 1;
		do {
			int num= (int)(Math.random()*45)+1;
			System.out.println(num);
			i++;
		}
		while (i<=6);
	}
}
