package com.javaex.ex01;

public class Ex07 {
	
	public static void main(String[] args) {
		
	// 대입연산자
		
		int a= 7;
		int b =2;
		
		System.out.println("산술연산자");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); // 몫3 나머지1 --> 몫을 표시
		System.out.println(a%b); // 몫3 나머지1 --> 나머지 표시
		
		//산술연산자 / % 자세히
		
		System.out.println("산술연산자 자세히");
		System.out.println(7.0/2.0); // 실수형으로 3.5
		System.out.println(7.0%2.0); // 나머지를 실수형으로 표시
		
		//부호연산자
		
		System.out.println("부호연산자");
		int var= -3;
		int pVar=+var;
		int mVar=-var;
		
		System.out.println(pVar);   // +(-3) = -3
		System.out.println(mVar);   // -(-3) = 3
		
		/////////////////////////////////////
		
		System.out.println("증감연산자");
		System.out.println(a);     // a=7
		System.out.println(++a);   // (1)a를 1올린다, (2)a를 출력한다 --> 8이 출력
		System.out.println(a);  // a=8
		
		System.out.println(b); // b=2
		System.out.println(--b); // (1)b를 1내린다, (2)b를 출력한다  --> 1이 출력
		System.out.println(b); // b=1
		
		System.out.println(a); // a=8
		System.out.println(a++); // (1)a를 출력한다 (2)a를 1올린다
		System.out.println(a);
		
		System.out.println(b); // b=1
		System.out.println(b--); // (1)b를 출력한다 (2)b를 1soflsek
		System.out.println(b); // b=0
		
	}

}
