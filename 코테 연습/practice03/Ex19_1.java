package com.javaex.practice;

import java.util.Scanner;

public class Ex19_1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int num;
		int bal= 0;
		do {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			num= sc.nextInt();
			
			switch(num) {
				case 1:
					System.out.print("예금액> ");
					int depo= sc.nextInt();
					bal= bal+depo;
					break;
				
				case 2:
					System.out.print("출금액> ");
					int with= sc.nextInt();
					bal= bal-with;
					break;
					
				case 3:
					System.out.println("잔고액> "+bal);
					break;
				
				case 4:
					System.out.println("프로그램 종료");
					break;
					
				default :
					System.out.println("다시 입력해주세요.");
					break;
			}
		}
		while(num!=4);
		sc.close();
	}
}
