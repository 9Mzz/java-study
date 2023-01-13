package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		에러 메시지 수정하기
//		i<=intArray
		
		
		int [] intArray = new int[5];
//		int [] intArray = new int[5];
		
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for (int i =0; i<intArray.length; i++) {
			result = result + intArray[i];
			
		}
		System.out.println(result);
	}

}
