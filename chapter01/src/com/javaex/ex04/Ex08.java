package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		
		int i= 1;
	
		while(i>0) {
		
			i++;
			
			if(i%6==0&&i%14==0) {
				System.out.println(i);
				break;	
			}

		}
	}
}
