package com.javaex.ex06;

import java.util.Scanner;

public class StringApp01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		스트링 필드 메소드 유추
		
		
		String str01 = new String("하이");
		String str02 = new String("하이");
		
//		불린 다른 값이라고 판단
		System.out.println(str01 == str02);
		
		
		System.out.println(str01.hashCode());
		System.out.println(str02.hashCode());
		System.out.println("-----------------------");
		
		
		String str03 = "Hello";
		String str04 = "Hello";
//		약식 작성은 불린에서 같다고 판단
		System.out.println(str03==str04);
		
//		불린에서 같다고 했으니 해시코드 역시 같다
		System.out.println(str01.hashCode());
		System.out.println(str02.hashCode());
		
		
		str04 = "hello!!!!";
		System.out.println(str03);
		System.out.println(str04);
		System.out.println(str03==str04);
		
		System.out.println(str03.hashCode());
		System.out.println(str04.hashCode());
//		위에서 다르다고 했기 때문에 해시코드도 다르다고 출력
		
		
		System.out.println(str04.toString());
//		toString 출력이 hello!!!! 이라고 나옴.  재정의 된 것임
		
		
		
		
		/* 이것저것 테스트
		String str = "안녕2";
		String str = new String("안녕하세요");
		Scanner sc = new SCanner(System.in);
		
		Point p00 = "3,2";
		Point p01 = new Point (3,2);
		
		sc.close();
		*/
		
		
	}

}
