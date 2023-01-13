package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5개 숫자 키보드 입력 -> 평균 계산 출력
//		array 기능으로 표현해보자
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3, num4, num5;
		double avg;
		System.out.println("숫자를 입력하세요.");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		num5 = sc.nextInt();
		
		avg=(num1+num2+num3+num4+num5)/5;
		
		System.out.println("평균은 "+avg+"입니다.");
		
		sc.close();
		
	}

}
