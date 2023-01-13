package com.javaex.practice;

/* import java.util.Scanner; */

public class Ex19 {
	public static void main(String[] args) {
		
		/* Scanner sc= new Scanner(System.in); */
		
		final long kmps= 300000;
		long daysec= 60*60*24;
		long yearsec= 365*daysec;
		
		long dis= kmps*yearsec;
		System.out.println("빛이 1년 동안 가는 거리는 "+dis+"km 입니다.");
			
		
		/* sc.close(); */
		
	}

}
