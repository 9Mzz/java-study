package com.javaex.ex04;

public class Ex11 {

	public static void main(String[] args) {
		
		// continue 사용하기
		 
		for(int i= 1; i<=20; i++) {
			if(i%2==0||i%3==0) {
				continue;
			}
		System.out.println(i);	
		} 
		
		// 방법2 if-else 사용하기
		/*
		for(int i= 1; i<=20; i++) {
			if(i%2==0||i%3==0) {
				
			}
			else {
				System.out.println(i);
			}
		}
		*/
		
		// 방법3 ! 사용하기
		
		/* 
		for(int i= 1; i<=20; i++)
			if(!(i%2==0||i%3==0)) {
				System.out.println(i);
			}
		*/
	}
}
