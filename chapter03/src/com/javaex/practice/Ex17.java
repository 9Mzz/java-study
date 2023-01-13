package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		숫자 입력 -> 입력받은 갯수 만큼 * 출력
//		줄 바꿈 할때마다 * 갯수 1개씩 줄여서 출력
		
		int i, x, y, num;
		x = 0;
		y = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		
		num = sc.nextInt();
		
		
		
		for(i=0; i<num; i++) {
			for(y=0; y<(num-i); y++) {
				System.out.print("*");
			}
			System.out.println();
				
		}
		
		
		/* 순차출력 성공 그러나 별 1 2 3 4 5 점차 증가하는 모양 출력 
		for (i=1; i<=num; i++) {
			for (y=1; y<=i; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		*/
		
		
		
		/*
		for (i=1; i<=num; i++) {
			for (x=1;x<=num; x++) {
				for (y=1; y<=x; num--) {
					System.out.print("*");
				}
				System.out.println("");
			}
			
		}
		*/
		
		
		sc.close();
		
	}

}
