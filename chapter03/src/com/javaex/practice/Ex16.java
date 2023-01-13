package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		숫자1개 입력 -> 5의 배수 갯수 와 합계 출력
		
		int i, sum, num, count;
		sum = 0;
		count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하면 5의 배수와 그 합계 알려줌");
		
		num = sc.nextInt();
		
		
		for(i=1; i<=num; i++) {
			if(i%5 ==0) {
				count++;
				sum= sum + i;
			}
		}
		System.out.println("5의배수의 개수 : "+count);
		System.out.println("5의배수의 합계 : "+sum);
		
				
		
		/* 실패한 코드. 입력값의 %5를 써보려고 했다
		for(i=1; i<=num; i++) {
			if (num%5==0) {
				sum=num+i;
				System.out.println(i);
				System.out.println(sum);
			}
			
		}
		*/
		
		
		
		/* 5를 더해주는 방법으로 해결
		int num=sc.nextInt();
		int count=0;
		int sum=0;
		for(int i=5; i<=num; i=i+5) {
			cnt=cnt+1;
			sum=sum+i;
		}
		System.out.println("5의 배수의 개수: "+cnt);
		System.out.println("5의 배수의 합 : "+sum);
		*/
		
		sc.close();
		
	}

}
