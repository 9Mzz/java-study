package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		
		int[] intarray= new int[5];
		intarray[0]= 3;
		intarray[1]= 6;
		intarray[2]= 9;
		intarray[3]= 2;
		intarray[4]= 55;
		
		System.out.println(intarray[0]);
		System.out.println(intarray[1]);
		System.out.println(intarray[2]);
		System.out.println(intarray[3]);
		System.out.println(intarray[4]);
		
		System.out.println("=================================");
		
		for(int i= 0; i<=4; i++) {
			System.out.println(intarray[i]);
		}
	}
}
