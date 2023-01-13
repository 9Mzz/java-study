package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		문제 그림과 같이 출력, 간격은 탭 +"\t" 코드 사용

		
//		for 문으로 가로10줄 세로 10줄 조합하여 sysout에 x+y를 쓰면 해결
		
		int x , y;

//		앜ㅋㅋㅋ ㅅㅂ 드디어 성공! 더러웠고 다신 만나지 말자
		for(x=1 ; x<=10 ; x++) {
			for(y=0 ; y<=9 ; y++) {
				System.out.print((x+y)+"\t");
			}
			System.out.println("");
		}
//		솔직히 계산해서 맞춘게 아니고 trial and error 방식으로 풀었음 ㅠㅠ
		
		
		/* (x+y)활용해봤다 그러나 10번째 줄 표시 실패 
		for (x=0 ; x<9 ; x++) {
			for (y=1 ; y<=10 ; y++) {
				System.out.print((x+y)+"\t");
			}
//			숫자 10번 가로 뿌려주고 다음줄 넘어가기
			System.out.println("");
		}
		*/
		
		
		
	
		
		
		/* 3차 시도 실패
		for (x=1 ; x<=10 ; x++) {
			
			for (y=x+1 ; y<=19 ; y++) {
				System.out.println(x);
			}
			
			
		}
		*/
		
		
		/* 2차 시도 실패
		for (x=1 ; x<=9 ; x++) {
			
			for (y=x ; y<=18 ; y++) {
				System.out.print(y);	
			}
			System.out.println("");
		}
		
		
		
		for (y=1 ; y<=11 ; y++) {
		
			for (x=y ; x<=y ; x++) {
				System.out.print(y);	
			}
			System.out.println("");
		}
		*/
				

		/*
		1차 시도 실패 
		1에서 10까지 세로 출력
		for (y=1 ; y<=10 ; y++) {
			System.out.println(y);
		}
		
		
		1에서 10까지 가로 출력
		for (x=1 ; x<=9 ; x++) {
			
			for (y=2 ; y<=10 ; y++) {
				System.out.print(x);	
			}
			System.out.println("");
		*/
		
		
	}

}
