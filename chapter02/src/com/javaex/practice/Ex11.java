package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		알파벳 입력 -> 자음 모음 구분
//		switch case 사용해서 작성할것 
		
//		char alphabet;		
//		string alphabet;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳 : ");
		
		char alphabet = sc.next().charAt(0);
//		char alphabet = sc.nextLine().charAt(0);
		
//		charAt()은 스캐너에서 char타입을 못써서 등장.
//		String 저장한 문자열 중에서 한글자만 선택 char type 변환
//		숫자0으로 0번쨰 stiring 문자를 char 로 쓸 수 있다.
		
		
		switch (alphabet) {
			case 'a' :
				System.out.println("모음 입니다");
				break;
			
			case 'e' :
				System.out.println("모음 입니다");
				break;
			
			case 'i' :
				System.out.println("모음 입니다");
				break;	
				
			case 'o' :
				System.out.println("모음 입니다");
				break;
			
			case 'u' :
				System.out.println("모음 입니다");
				break;
				
			default :
			System.out.println("자음 입니다");
		}
		
		/*
		위처럼 여러번 sysout을 반복하지 말고 아래와 같이 써도 된다. 
		case 'a' :	
		case 'e' :		
		case 'i' :			
		case 'o' :		
		case 'u' :
			System.out.println("모음 입니다");
			break;
		default :
			System.out.println("자음 입니다");
		*/
		
		
		sc.close();
		
	}

}
