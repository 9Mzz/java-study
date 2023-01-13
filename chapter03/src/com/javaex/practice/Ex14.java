package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		입력한 숫자까지 더해주고 계산식도 보여주는 코드
		
		Scanner sc = new Scanner(System.in);
		
		int i, num, sum ;
		
		sum = 0;
		System.out.println("숫자를 입력하면 그 숫자까지 더하고 계산식도 보여줌 ㅇㅇ");
		
		System.out.print("숫자 :");
		
		num = sc.nextInt();

		
//		입력값보다 1 부족하게 반복 -> '입력값+' 모양으로 출력
		for(i=1; i<num; i++) {
			System.out.print(i+"+");
			sum= sum+i;
		}		
		sum = sum+i;
		
//		위에서 모자르게 반복한 1번을 1회만 실행 ->+표시 반복없이 숫자만 출력
		System.out.println(i);		
		System.out.println("합계: "+sum);
		
		
		/* 처음에 1을 출력 시켜놓고 2부터 계산하는 방법 어차피 1부터 시작
		sum=1;
		
		System.out.print("1");
		
		for(i=2; i<=num; i++) {
			sum=sum+i;
			System.out.print("+"+i);
		}
		System.out.println("");
		System.out.println("합계: "+sum);
		*/

		
		
		/* 5입력하면 5뒤에 + 붙음. 실패
		for (i=1; i<=num; i++) {
			
			sum=sum+i;
			System.out.print(i+"+");
			
				
		}
		
		System.out.println("");
		System.out.println("합계 : "+sum);
		
		*/
		
		
		
		
		sc.close();
		
		
	}

}
