package com.javaex.ex04;

public class Ex07 {

	public static void main(String[] args) {
			
		for(int y= 1; y<=6; y++) {	
			for(int x= 1; x<=y; x++) {
				System.out.print("*");
				}
			
			System.out.println();	
		}
		
		
		// method2
		
		/*
		String star= "*";
		
		for(int y= 1; y<=6; y++) {
			
			System.out.print(star);
			star= star+"*";
			
			System.out.println();
		}
		
		*/
	}
}
