package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("가로를 입력하세요: ");
		int width= sc.nextInt();
		System.out.print("세로를 입력하세요: ");
		int height= sc.nextInt();
		
		double area= width*height;
		double perimeter= 2*width+2*height;
		
		System.out.println("사각형의 넓이는 "+area);
		System.out.println("사각형의 둘레는 "+perimeter);
		
		sc.close();
	}

}
