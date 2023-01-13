package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		숫자1개를 입력 -> 입력한 숫자까지 누적 합계 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하면 그 숫자까지 합해줌 ㅇㅇ");
		
		int i, num, sum;
		sum=0;
		
		num = sc.nextInt();
		
		
		for (i=1; i<=num; i++) {
			sum=sum+i;
			}
		
		System.out.println("합계 :"+sum);
		
		
		/* 만들다 버린 코드
		for(i=0 ; i<=num ; i++) {
			
			for (sum=0;sum<=num;num++) {
				sum = num+i;
				System.out.println("합계 : "+sum);
			}
		}	
		*/	
		
		
		sc.close();
		
	}

}
