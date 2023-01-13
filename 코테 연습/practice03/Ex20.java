package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		String exit;
		boolean restart= true;
		
		while(restart) {
			int RA= (int)(Math.random()*100)+1;
			
			System.out.println("=============================");
			System.out.println("      [숫자 맞추기 게임 시작]      ");
			System.out.println("=============================");
		
			while(true) {
				System.out.print(">>");
				int num= sc.nextInt();
				
				if(num>RA) {
					System.out.println("더 낮게");
				}
				else if(num<RA) {
					System.out.println("더 높게");
				}
				else {
					System.out.println("정답입니다.");
					break;
				}
			}
			while(true) {
				System.out.print("게임을 종료하시겠습니까?(y/n) >>");
	
				exit= sc.next();
			
				if(exit.equals("y")) {
					restart= false;
					break;
				}
				else if(exit.equals("n")) {
					break;
				}
				else {
					System.out.println("please enter \'y\' or \'n\'");
				}
			}
		}
			
		System.out.println("=============================");
		System.out.println("      [숫자 맞추기 게임 종료]      ");
		System.out.println("=============================");

		sc.close();
	}
}
