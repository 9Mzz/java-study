package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		기호(+-*/) 숫자1 숫자2 순서 입력
//		입력한 내용으로 계산 결괏값을 출력
//		나눗셈에서 분모0은 계산할수없습니다 출력
		
		
//		기호를 못받았다 -> 기호를 charAt(0) 으로 받아 쓰자
//		switch로 기호별 계산을 했다. 
//		double 만 sysout에서 계산하니 소숫점 에러가 있어 별도의 double 값(outcome)을 지정해서 계산해 sysout에서 불러왔다.

//		double 합산후 소숫점 문제는 BigDecimal 으로 해결 할 수도 있다
//		BigDecimal BDnum1 = new BigDecimal(String.valueof(num1));
//		BigDecimal 변수명 = new BigDecimal("값");
		

		
		double num1 , num2, outcome;
		char sign;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력되는 내용을 입력하세요.");
		System.out.print("기호 : ");
		
		sign = sc.nextLine().charAt(0);
		
		System.out.print("숫자1 : ");
		num1 = sc.nextInt();
		
		System.out.print("숫자2 : ");
		num2 = sc.nextInt();
		
//		switch로 입력하는 기호sign에 맞춰 계산하자
				
//		double을 별도 계산하는 방법으로 소숫점 문제 해결
		 
		switch (sign) {
			case '+' :
				outcome = num1 + num2;
				System.out.println("결과는 :"+outcome);
				break;
			
			case '-' :
				outcome = num1 - num2;
				System.out.println("결과는 :"+outcome);
				break;
			
			case '*' :
				outcome = num1 * num2;
				System.out.println("결과는 :"+outcome);
				break;
				
			case '/' :
				if (num2==0) {
					System.out.println("계산할 수 없습니다.");
				} else {
					outcome = num1 / num2 ;
					System.out.println("결과는 :"+outcome);
				} 
				break;
				
			default :
				System.out.println("계산할 수 없는 기호입니다.");
		}
		
		
		
		
		sc.close();
		
	}

}
