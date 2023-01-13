package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		
		int score= sc.nextInt();
		
		/* if(score>=90) {
			System.out.println("A등급");
		}
		else if(score>=80) {
			System.out.println("B등급");
		}
		else if(score>=70) {
			System.out.println("C등급");
		}
		else if(score>=60) {
			System.out.println("D등급");
		}
		else {
			System.out.println("F등급");
		} */
		// && 이용하여 동시에 2가지 조건 만족시킬수 있음
		if (score>=90) {
			System.out.println("A등급");
		}
		else if(89>=score&&80<=score) {
			System.out.println("B등급");
		}
		else if(79>=score&&70<=score) {
			System.out.println("C등급");
		}
		else if(69>=score&&60<=score) {
			System.out.println("D등급");
		}
		else {
			System.out.println("F등급");
		}
		sc.close();
	}

}
