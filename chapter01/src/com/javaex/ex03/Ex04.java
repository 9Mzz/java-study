package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("근무시간: ");
		
		int wh= sc.nextInt();
		int oh= 12000;
		
		if(wh<=8) {
			System.out.println("임금은 "+(wh*10000)+"원 입니다.");
		}
		else if(wh>8) {
			System.out.println("임금은 "+(80000+(wh-8)*oh)+"원 입니다.");
		}
		
		sc.close();
		

	}

}
