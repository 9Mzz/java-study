package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		배열 데이터를 이용해 3의 배수의 갯수와 배수의 합
		
		int[] data = {1,3,5,8,9,11,15,19,18,20,30,33,31};
		int i, sum;
		sum=0;
		
		for (i=0 ; i<data.length ; i++) {
			sum=data[i]%3+sum;
		}
		
		System.out.println("주어진 배열에서 3의 배수의 갯수=> "+i);
		System.out.println("주어진 배열에서 3의 배수의 합=> "+sum);
	}

}
