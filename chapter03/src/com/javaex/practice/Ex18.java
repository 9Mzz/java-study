package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		숫자 입력 받아 별모양 대칭 출력
				
		int i, j, k, num;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 :");
		
		num = sc.nextInt();
		
		
		for(j=0; j<num; j++) {
			for(i=1; i<=(num-j); i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(j=1; j<num; j++) {
			System.out.print("*");
			for(i=1; i<=j; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
		
		/* math abs 써서 해결하는 방법
		for(i=0; i<num*2-1; i++) {
			for(j=0; j<=Math.abs(num-i-1) ;j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		*/
		
		
		/* 실패
		for (i=0; i<=num; i++) {
			for (j=0; j<num-i; j++) {
				if (j==1) {
					for (k=0; k<num+i; k++) {
						System.out.println("*");
					} 
				}
				
				
			}
			System.out.println("");
		}
		*/
		
		sc.close();
		
	}

}
