package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		숫자 1개 입력 -> 입력 수의 약수 출력
//		약수 = 어떤수와 나누었을때 나머지가 없는 수 i%j==0
		
		int i, num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력하면 그 숫자의 약수 알려줌 ㅇㅇ");
		
		num = sc.nextInt();
		
		for(i=1; i<=num; i++) {
			if (num%i == 0) {
				System.out.println(i);
			}
		}
		
		
		/* 1차 시도 출력 실패
		for(i=1; i<=num; i++) {
			
			for(j=1; j<=num; j++) {
				while (i%j==0) {
					System.out.println(i);
					break;
				}			
				
			}
		}
		*/
		
		
		sc.close();
		
	}

}
