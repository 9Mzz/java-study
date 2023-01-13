package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		
		int[] arrA= {3,6,9};
		int[] arrB= arrA;
		
		for(int i= 0; i<arrA.length; i++) {
			System.out.println(arrB[i]);
		}
		
		for(int b= 0; b<arrB.length; b++) {
			System.out.println(arrB[b]);
		}
	}

}
