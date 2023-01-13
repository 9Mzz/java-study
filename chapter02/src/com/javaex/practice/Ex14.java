package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		수익 입력 -> 소득세 계산 하기
		
//		double 는 정수 입력할떄 소숫점 .0 도 넣을것 10.0 이나 100.0
//		계산 정확도를 위해 곱셈 나눗셈은 가로를 사용해서 정리해 줄것.
		
		Scanner sc = new Scanner(System.in);
		
		double income , tax;
		
		System.out.println("수익을 입력해 주세요.");
		System.out.print("금액 : ");
		
//		System.out.print(1000.0*0.09+((2000-1000.0)*0.18));
		
		income = 0;
		income = sc.nextDouble();
		
//		0원이상 1000만원 이하인 경우 tax: 0.09*수익
		if (income >= 0 && income <= 1000) {
			tax = income*0.09;
			System.out.println("소득세는 "+tax+" 입니다");
		} 
		
//		1000만원 초과 4000만원 이하인 경우 
//		tax: 1000*0.09 + 0.18*(수익-1000)
		else if (income > 1000 && income <= 4000) {
			tax = 1000.0*0.09+((income-1000.0)*0.18);
			System.out.println("소득세는 "+tax+" 입니다");
		} 
		
//		4000만원 초과 8000만원 미만인 경우 
//		tax: 1000*0.09 + 3000*0.18 + 0.27*(수익-4000)
		else if (income > 4000 && income < 8000) {
			tax = 1000*0.09+3000*0.18+0.27*(income-4000);
			System.out.println("소득세는 "+tax+" 입니다");
		} 
		
//		8000만원 이상인 경우 
//		tax: 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(수익-8000)
		else if (income >= 8000) {
			tax = (1000.0*0.09)+(3000.0*0.18)+(4000.0*0.27)+0.36*(income-8000.0);
			System.out.println("소득세는 "+tax+" 입니다");
		} 
		
		else {
			System.out.println("잘못 입력했습니다.");
		}
		
		
		/* 처음에 만들어본 코드
		if (income <= 1000 && income >0 ) {
			tax = income*0.09;
			System.out.println("소득세는 "+tax+" 입니다");
		} else if (income > 1001 && income <= 4000) {
			tax = 1000.0*0.09+((income-1000.0)*0.18);
			System.out.println("소득세는 "+tax+" 입니다");
		} else if (income > 4001 && income > 8000) {
			tax = 1000*0.09+3000*0.18+0.27*(income-4000);
			System.out.println("소득세는 "+tax+" 입니다");
		} else if (income > 8000) {
			tax = 1000*0.09+3000*0.18+4000*0.27+0.36*(income-8000);
			System.out.println("소득세는 "+tax+" 입니다");
		} else if (income<0) {
			System.out.println("잘못 입력했습니다.");
		} else {
			System.out.println("잘못 입력했습니다.");
		}
		*/
		
		sc.close();
	}

}
