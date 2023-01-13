package com.javaex.practice;

import java.util.Scanner;

public class Ex10_1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int i= 1;
		int max= 0;
		
		do {
			System.out.print("숫자: " );
			int num= sc.nextInt();
				if(num>max) {
				max=num;
				}
			i++;	
		}
		while (i<=5);
		
		System.out.println("최대값은 "+max+"입니다.");
		sc.close();

	}
}
