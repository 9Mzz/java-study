package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		홀수 입력 -> 입력값까지 홀수의 합 출력
//		짝수 입력 -> 입력값까지 짝수의 합 출력
		
		Scanner sc = new Scanner(System.in);
		
		int num, i;
		int sum = 0 ;
		System.out.println("숫자를 입력하세요.");
		
		num = sc.nextInt();
		
		
		if (num%2==0) {
			for (i=0; i<=num; i++) {
				if (i%2==0) {
					sum=sum+i;
				}
			}
			
		} else {
			for (i=0; i<=num; i++) {
				if (i%2==1) {
					sum=sum+i;
				}
			}
		}
		System.out.println("입력값 홀수끼리 짝수끼리 합한 값:"+sum);
		
		
		
		/* 4차시도 while으로 해보려다가 역시 이건 아닌 것 같다
		while (num%2==0) {
			for (num=sum;num>sum;num++) {
				sum += num;
				System.out.println("결과값 : "+sum);
				
				}
			break;
		}
		*/
		
		
		/* 3차시도 다시 while로 시도해보려고 했다. 
		sum = 0;
		while (true) {
			num=num+1;
			
			if (num%2==0||num%2!=0) {
				
				sum = num + sum;
				System.out.println("결괏값 : "+sum);
				break;
			}
		}
		*/
		
		
		/* 2차 시도 switch로 시도해보려고 했다.
		switch (num) {
			case (num%2==0) :
				
				sum = num;
				System.out.println("합"+sum);
				break;
				
			case (num%3==0) :
				System.out.println(sum);
				break;
				
			default :
				System.out.println("");
				break;
		}
		*/
		
		
		/* 1차시도 while 로 표현해보려고 했다.
		while (num%2==0) {
			
			
			break;
		}
		
		
		System.out.println("결괏값 : "+sum);
		*/
		
		sc.close();
		
		
	}

}

