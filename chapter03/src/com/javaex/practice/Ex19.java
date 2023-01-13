package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		은행 프로그램 작성
			
		int choose, deposit, withdrawal, balance;
		balance = 10000;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("----------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("----------------------------");
		System.out.print("선택>");
		choose = sc.nextInt();
		
		
		
		switch (choose) {
			case 1 :
				while (true) {
					System.out.println("현재 잔고는 "+balance+"원 입니다.");
					System.out.print("예금액>");
					deposit = sc.nextInt();
					balance = deposit + balance;		
					System.out.println("예금액은 "+balance+"원 입니다");
					System.out.println("");
					continue;
				}
				
			case 2 :
				while (true) {
					System.out.println("현재 잔고는 "+balance+"원 입니다.");
					System.out.print("출금액>");
					deposit = sc.nextInt();
					balance = balance - deposit;		
					System.out.println("출금액은 "+deposit+"원 입니다");
					System.out.println("");
					continue;
				}
			
			case 3 :
				System.out.println("잔고액> "+balance+"원");
				break;
			
			case 4 :
				System.out.println("프로그램 종료함 ㅃㅃㅇ");
				break;
		
			default :
				System.out.println("다시 입력해주세요.");				
				break;
		}
		

		
		
		
		
		sc.close();
		
	}

}
