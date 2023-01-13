package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		두개 정수 입력 -> 큰수 작은수 나눈몫과 나머지
//		quotient remainder 
		
		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		num1 = sc.nextInt();
		
		System.out.print("두번째 숫자 : ");
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("몫 :"+num1/num2);
			System.out.println("나머지 :"+num1%num2);
		} else {
			System.out.println("몫 :"+num2/num1);
			System.out.println("나머지 :"+num2%num1);
		}
		
		
		
		sc.close();
	}

}
