package com.javaex.ex05;

public class Ex03 {
	public static void main(String[] args) {
		
		// 1번
	 
		int[] array= new int[5];   // length=5
		
		array[0]= 3;
		array[1]= 7;
		array[2]= 13;
		array[3]= 55;
		array[4]= 74;
		
		/* 2번		
		int[] array= new int[] {3,7,13,55,74};		
		*/
		
		//3번
		// int[] array= {3,7,13,55,74};
		
		System.out.println(array[0]);
		
		for(int i= 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("===============================");
		
		char[] word= new char[3];
		
		word[0]= 'a';
		word[1]= 'b';
		word[2]= 'c';
		
		System.out.println(word[2]);
		
		for(int a= 0; a<=2; a++) {
			System.out.print(word[a]);
		}
	}
}
