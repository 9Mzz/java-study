package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("반지름: ");
		double rad= sc.nextDouble();
		
		final double pi= 3.14;
		double V= ((double)4/(double)3)*pi*(rad*rad*rad);
		
		System.out.println("구의 부피는: "+V+" 입니다.");
		
		sc.close();
	}
}
