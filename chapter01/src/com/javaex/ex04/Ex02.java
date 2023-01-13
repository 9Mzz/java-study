package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("단을 입력해 주세요.");
		System.out.print("단 :");
		int dan= sc.nextInt();
		
		int multipl= 1;

		while(multipl<10) { 
			System.out.println(dan+" * "+multipl+" = "+dan*multipl);
			
			multipl++;
		} 
		
		sc.close();
	}
}
