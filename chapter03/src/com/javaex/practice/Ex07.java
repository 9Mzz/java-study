package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		숫자 입력받아 문제속 그림과 같이 출력 4입력 7입력
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;

		System.out.println("숫자를 입력하세요 4 or 7");
		
		x=sc.nextInt();
		y=1;
		switch (x) {
			case 4 :
				for (x=1 ; x<=4 ; y++) {
					
					for (x=1 ; x<=y ; x++) {
//						x개를 가로갯수 입력받고 y로 세로갯수 출력
//						세로 줄수y와 같은 수로 연속 표현하려면 sysout y
						System.out.print(y);
					}
					System.out.println("");
				}
				break;
				
			case 7 :
				
				for (x=1 ; x<=7 ; y++) {
					
					for (x=1 ; x<=y ; x++) {
						System.out.print(y);
					}
					System.out.println("");
				}
				break;
				
								
			default :
				System.out.println("4나 7을 입력하세요.");
				break;
			
		}
		
		sc.close();
	}

}
