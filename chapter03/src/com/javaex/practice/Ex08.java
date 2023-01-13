package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		구구단 출력
		int x , dan;
				
		for (x=1 ; x<=9 ; x++) {
			
//			for 문의 안밖의 조건 위치를 서로 바꾸면 가로, 세로 순차 출력 변경됨 

//			구구단 순차 출력 시작
			for (dan=2 ; dan<=9 ; dan++) {
				System.out.print(dan+"*"+x+"="+dan*x+"  ");			
			}
			
			
//			구구단 순차 출력 종료
			System.out.println("");
			
			
			
		}
		
	}

}
