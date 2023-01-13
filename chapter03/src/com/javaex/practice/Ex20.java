package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1~100 숫자 맞추는 게임
//		게임 재시작 구현 실패
		
		int num, answer;
		String str;
		str = "y";
		str = "n";
		
		
		answer = 47;
		num = 0;
		Scanner sc = new Scanner(System.in);
		
		 
		
		System.out.println("======================");
		System.out.println("    [숫자 맞추기 게임]");
		
		
		System.out.print(">>");
		num = sc.nextInt();
		
				
		
		
		while (true) {
			
			if (num<answer) {
				System.out.println("더 높게");
				System.out.print(">>");
				num = sc.nextInt();
				continue;
			} else if (num>answer) {
				System.out.println("더 낮게");
				System.out.print(">>");
				num = sc.nextInt();
				continue;
			} else {
				System.out.println("정답입니다.");
				System.out.print("게임을 종료하시겠습니까? (y/n) >>");
				str = sc.nextLine();
				
					if (str=="y") {
						System.out.println("게임을 종료합니다.");
						
					} else {
						System.out.println("게임을 다시 시작합니다");
					}
			}
			
			
		}
		

		
		
//		sc.close();	
		
		
		
		/*
		switch (num) {
			case 1 :
				break;
				
			case 2 :
				break;
			
			case 3 :
				break;
			
			default :
				break;
		
		}
		*/
		
		
	}

		
}
