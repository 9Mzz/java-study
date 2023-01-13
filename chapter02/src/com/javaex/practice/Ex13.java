package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		f(x)=(x^3-9x+2, x<=0) , (7x+2, x>0)
//		위 함수에서 x 숫자 입력 -> 함수 계산값 출력
		
//		sysout에서 계산식 넣으니 결괏값이 이상해서 double outcome 지정후 계산했다.
		
		double x , outcome;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요.");
		System.out.print("숫자 :");
		
		x = sc.nextDouble();
		
		if (x <= 0) {
			outcome = (x*x*x)-(9*x)+2;
			System.out.println("계산결과는 "+outcome+"입니다.");
			
		} else {
			outcome = (7*x)+2;
			System.out.println("계산결과는 "+outcome+"입니다.");
		}
		
		sc.close();
	}

}
