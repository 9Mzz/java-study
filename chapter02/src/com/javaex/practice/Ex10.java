package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		팀a 팀b 팀c 사번/3 값의 나머지 0=a 1=b 2=c 
//		사번0은 고려x
		
		int team;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번(정수)를 입력해주세요");
		System.out.print("사번 :");
		
		team = sc.nextInt();
		
		switch (team%3){
			case 0 :
				System.out.println("A팀입니다");
				break;
			case 1 :
				System.out.println("B팀입니다");
				break;
			case 2 :
				System.out.println("C팀입니다");
				break;
			
			default :
				System.out.println("잘못 입력하셨습니다.");
				break;
				
		}
		
	
			
			
		sc.close();
		
	}

}
