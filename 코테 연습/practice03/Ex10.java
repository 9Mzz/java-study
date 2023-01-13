package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		System.out.print("숫자: ");
		int num1= sc.nextInt();
		
		System.out.print("숫자: ");
		int num2= sc.nextInt();
		
		System.out.print("숫자: ");
		int num3= sc.nextInt();
		
		System.out.print("숫자: ");
		int num4= sc.nextInt();
		
		System.out.print("숫자: ");
		int num5= sc.nextInt();
		
		int max= num1; // 가정
		
		while(true) {
			
			if(num1<num2) {
				max= num2;
			}
			if(max<num3) {
				max= num3;
			}
			if(max<num4) {
				max= num4;
			}
			if(max<num5) {
				max= num5;
			}
			System.out.println("최대값은 "+max+"입니다.");
			break;
		}
		sc.close();
	}
}
