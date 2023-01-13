package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		에러 메시지 수정 해보기
		intB 배열 선언 불량
		
		아래 3개의 방법 중 하나를 골라서 선언하면 ok
		int[] intArray = new int[3]
		int[] intArray= new int[] {1,2,3};
		int[] intArray= {1,2,3}
		*/
		
		
		int [] intA = {3,6,9};
		int [] intB = {20,0,10};
		
		/* 잘못 선언한 intB 
		int[] intB;
		intB[0] = 20;
		intB[2] = 10;
		*/
		
		
		
		for (int i=0; i<intA.length; i++) {
			System.out.println(intA[i]);
		}
		
		
	}

}
