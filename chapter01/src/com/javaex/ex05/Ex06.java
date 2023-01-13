package com.javaex.ex05;

public class Ex06 {
	public static void main(String[] args) {
		
		int[] leftint= new int[3];
		
		leftint[0]= 10;
		leftint[1]= 20;
		leftint[2]= 30;
		
		int[] rightint= new int[4];
		rightint[0]= 10;
		rightint[1]= 22;
		rightint[2]= 30;
		rightint[3]= 40;
		
		for(int i= 0; i<leftint.length; i++) {
			if(leftint[i]!=rightint[i]) {
				System.out.println(i+"번째 값이 다릅니다.");
			}
			else {
				System.out.print("");
			}
		}
		 if(leftint.length!=rightint.length) {
				System.out.println("배열의 크기가 다릅니다.");
			}
	}
}
