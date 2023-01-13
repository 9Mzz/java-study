package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		배열 사용 1~45 숫자 중 임의의 숫자6개 출력, 중복은 제거
//		int num = (int)(Math.random()*최대값)+최소값;
		
		
		int n01, n02, n03, n04, n05, n06;
		
		n01 = ((int)(Math.random()*45))+1 ;
		n02 = ((int)(Math.random()*45))+1 ;
		n03 = ((int)(Math.random()*45))+1 ;
		n04 = ((int)(Math.random()*45))+1 ;
		n05 = ((int)(Math.random()*45))+1 ;
		n06 = ((int)(Math.random()*45))+1 ;
		
		System.out.println(n01);
		System.out.println(n02);
		System.out.println(n03);
		System.out.println(n04);
		System.out.println(n05);
		System.out.println(n06);
		
		
	}

}
