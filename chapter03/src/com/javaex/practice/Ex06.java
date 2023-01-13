package com.javaex.practice;

public class Ex06 {
	public static void main (String []args) {
		
//		1에서 100까지 5의 배수 & 7의 배수 출력
		
		int x;
		x = 0;
		
		for (x=1 ; x<=100 ; x++) {
			
			if (x%5 ==0 && x%7 ==0) {
				System.out.println(x);
			}
			
		}
	}
}
