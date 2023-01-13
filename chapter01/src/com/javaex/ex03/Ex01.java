package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("점수: ");
		
		int score= sc.nextInt();
		
		if(score>=60) { // 입력한 값이 60점 "이상"이니?
			//질문이 true 일때만 실행되는 영역
			
			System.out.println("합격입니다.");
		}
		
		/* if(score<60) {
			System.out.println("불합격입니다.");
		} */
		
		sc.close();
	}

}
