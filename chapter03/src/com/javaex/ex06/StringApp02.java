package com.javaex.ex06;

public class StringApp02 {
	public static void main (String[] args) {
		
		System.out.println("==메소드 concat 써보기");
//		문자 배열 a b
		String a = " abcd"; //앞에 공백이 있다 
		String b = ",efg "; //뒤에 공백이 있다
		
//		누구를 지정해서 쓴건지 신경써서 메소드를 사용하자
		System.out.println(a.concat(b));
		System.out.println(b.concat(a));
//		a b 문자열이 합쳐졌다
		System.out.println("==================");
		
		a = a.concat(b);
		System.out.println(a);
//		a가 달라졌다.
		
		
		System.out.println("==메소드 trim 써보기");
		a = a.trim();
		System.out.println("앞공백==>"+a+"<==뒤 공백없이 붙은것 확인");
		
//		문자의 맨앞이나 맨뒤의 스페이스(공백)을 지운다.
//		써먹는 예 : 회원가입할때 아이디에 스페이스 입력을 지워버린다

		
		
		System.out.println("==메소드 replace 써먹어보자");
		a = a.replace("ab", "홍길동");
		System.out.println(a);
//		ab 문자열이 홍길동으로 바뀌었다
		
		
		System.out.println("==메소드 split 을 써보자");
		String[] sArray = a.split(",");
//		, 기준으로 잘라 나눠라
		
			for (int i=0; i<sArray.length; i++) {
				System.out.println(sArray[i]);
			}
//		,가 1개라서 2번 나눠진다 ,가 2개라면 3번 나누겠지	
			
			String str = "Hello JAVA!";
			String r01 = str.substring(3);
//			방번호 3번부터 출력하라
			System.out.println(r01); //3개 문자 뺴고 lo JAVA! 출력 

			String r02 = str.substring(8);
			System.out.println(r02); // VA! 출력
			
			String r03 = str.substring(3, 8);
			System.out.println(r03); // 2개 넣어서 쓸 수 있다 lo JA 출력
//			써먹는 예 주민번호 1 2 번으로 남자 여자 구별 가능
			
			
			
		System.out.println("==================");
		
	}
}
