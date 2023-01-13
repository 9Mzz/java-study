package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("화씨: ");
		double F= sc.nextDouble();
		
		double C= (double)5/(double)9*(F-32);
		
		System.out.println("화씨 "+F+"의 섭씨온도는 "+C+" 입니다.");
		
		sc.close();
	}

}
