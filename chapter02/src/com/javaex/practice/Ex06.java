package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		두개 숫자 입력 -> 큰수 작은수 분류 출력
		
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.println("숫자 2개를 입력해주세요.");
		
		System.out.print("숫자1 : ");
		
		num1 = sc.nextInt();
		
		
		System.out.print("숫자2 : ");
		
		num2 =sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("큰수 :"+num1+"     작은수 :"+num2);
		} else if (num1 < num2) {
			System.out.println("큰수 :"+num2+"     작은수 :"+num1);
		} else {
			System.out.println("큰수 :"+num2+"     작은수 :"+num1);
		}
		
		sc.close();
	}

}
