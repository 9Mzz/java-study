package com.javaex.practice;

public class Ex06 {
	public static void main(String[] args) {
		
		int i= 1;
		boolean action= true;
		
		while(action) {
			if(i%5==0&&i%7==0) {
				System.out.println(i);
			}
			else if(i==100) {
				action= false;
			}
			i++;
		}
	}

}
