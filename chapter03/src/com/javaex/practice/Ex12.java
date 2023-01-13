package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		숫자입력 -> 팩토리얼 계산 
//		팩토리얼 공식 1부터 N까지 곱셈 n! = n*(n-1) * ... * 1
		
		Scanner sc = new Scanner(System.in);
		
		int num, factorial, i;
				
			
		System.out.println("숫자를 입력하세요");
		num = sc.nextInt();
		factorial=1;
		
		for (i=1; i<=num; i++) {
			
//			펙토리얼이 증가해나가는 수식 보여줘
			System.out.println("facto:"+factorial+" i:"+i+" = "+factorial*i);
			
			factorial = factorial*i;
		}
		System.out.println("결과값: "+factorial);
		
		sc.close();
		
		
		
		/* 2차 실패 		
		for (i=0; i<=num; i++) {
			while (i<=num) {
				sum=num*i;
				break;
			}
			
		}
		
		System.out.println(sum);
		*/
		
		
		/*
		while (true) {
			
			if (num>1) {
				num++;
				sum= (sum * num);
				System.out.println("결괏값 : "+sum);
			}
			
			break;
		}
		*/
		
		sc.close();
		
	}

}
