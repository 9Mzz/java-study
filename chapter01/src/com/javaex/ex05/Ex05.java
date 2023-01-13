package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		
		int[] arrA= new int[3];
		
		arrA[0]= 3;
		arrA[1]= 6;
		arrA[2]= 9;
		
		int[] arrB= new int[3];
		
		for(int i= 0; i<arrA.length; i++) {
			arrB[i]= arrA[i];
		}
		
		arrB[1]= 100;
		
		for(int a= 0; a<arrA.length; a++) {
			System.out.println(arrA[a]);
		}
		
		System.out.println("====================================");
		
		for(int b= 0; b<arrB.length; b++) {
			System.out.println(arrB[b]);
		}
		

	}

}
