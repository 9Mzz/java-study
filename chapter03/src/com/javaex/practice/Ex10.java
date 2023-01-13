package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		정수 5개 입력 -> 가장 큰수 출력
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
	
		int num;
		int max = 0;
		for(int i=0; i<5; i++) {
			System.out.print("숫자: ");
			num = sc.nextInt();
			if(num>max) {
//				중괄호는 그냥 빼먹은 것인가?
//				숫자 1입력 num 		
				max=num;}
		}
		
		System.out.println("최대값은 "+max+"입니다.");
		
		sc.close();
		
		
		/* if 로 만들어봄
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		
		System.out.println("숫자를 입력하세요.");
		System.out.print("숫자 : ");
		num1 = sc.nextInt();
		
		System.out.print("숫자 : ");
		num2 = sc.nextInt();
		
		System.out.print("숫자 : ");
		num3 = sc.nextInt();
		
		System.out.print("숫자 : ");
		num4 = sc.nextInt();
		
		System.out.print("숫자 : ");
		num5 = sc.nextInt();
		
		
		if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
			System.out.println("최대값은 "+num1+"입니다.");
		} else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
			System.out.println("최대값은 "+num2+"입니다.");
		} else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
			System.out.println("최대값은 "+num3+"입니다.");
		} else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
			System.out.println("최대값은 "+num4+"입니다.");
		} else {
			System.out.println("최대값은 "+num5+"입니다.");
		}
		
		
		sc.close();
		
		*/
		
	}

}
