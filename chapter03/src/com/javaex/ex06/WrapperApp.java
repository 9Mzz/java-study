package com.javaex.ex06;

public class WrapperApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no = 11;
		Integer i = new Integer(10);
		Short s = new Short((short)3); //강제 형변환 해서 넣기
		byte b = new Byte((byte)2);
		
		System.out.println(no);
		System.out.println(i);
		System.out.println(s);
		System.out.println(b);
		
		int num01 = 10;
		int num02 = 7;
		int intResult = num01 + num02; // 10 + 7
		System.out.println(intResult);
		
		
		Integer i01 = new Integer(10);
		Integer i02 = new Integer(7);
		Integer result = i01 + i02;
		System.out.println(result);
		
		
		Integer i03 = 99;   //99 -> new Integer(99)
 		
		System.out.println("--------------------------");
		
		
//		문자열 -> int
//		static에 숫자 올리는 비효율적인 방법
		Integer i05 = 10; //일부러 static에 아무 의미 없는 숫자10을 올림 
		int r01 = i05.parseInt("12345");
		System.out.println(r01);


//		static 에 숫자를 올리는 적절한 방법
		int r02 = Integer.parseInt("1234");
		System.out.println(r02);
		
		System.out.println("--------------------------");
		
		
//		int -> 문자열 valueof(int num)
		String a = "안녕하세요";
		String snum = a.valueOf(54321);
		System.out.println(snum);
		
		String r100 = ""+54321;
		System.out.println("안녕"+1234);
		System.out.println(r100);
		
		
		
		
	}

}
