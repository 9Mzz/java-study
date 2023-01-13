package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("500원의 개수: ");
		int c500= sc.nextInt();
		
		System.out.print("100원의 개수: ");
		int c100= sc.nextInt();
		
		System.out.print("50원의 개수: ");
		int c50= sc.nextInt();
		
		System.out.print("10원의 개수: ");
		int c10= sc.nextInt();
		
		System.out.println("동전의 총합은 "+((500*c500)+(100*c100)+(50*c50)+(10*c10))+"원 입니다.");
		
		sc.close();
	}

}
