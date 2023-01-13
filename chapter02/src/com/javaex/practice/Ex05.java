package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		키 몸무게 입력 -> 저체중 표준체중 과체중 출력
//		표준체중 = (키-100) x 0.9
		
		Scanner sc = new Scanner(System.in);
		
		int weight;
		int height;
		double standard;
		
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키 :");
		height = sc.nextInt();
		
		System.out.print("몸무게 :");
		weight=sc.nextInt();
		
		
		standard = (height - 100)*0.9;
		
		if (standard > weight) {
			System.out.println("저체중 입니다.");
		} else if (standard < weight ) {
			System.out.println("과체중 입니다.");
		} else {
			System.out.println("표준 입니다.");
		}
		
		System.out.println("표준체중: "+standard);
		sc.close();
	}

}
