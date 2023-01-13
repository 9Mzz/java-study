package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		int[] wonArray= new int[10];
		
		wonArray[0]= 50000;
		wonArray[1]= 10000;
		wonArray[2]= 5000;
		wonArray[3]= 1000;
		wonArray[4]= 500;
		wonArray[5]= 100;
		wonArray[6]= 50;
		wonArray[7]= 10;
		wonArray[8]= 5;
		wonArray[9]= 1;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("금액: ");
		int total= sc.nextInt();
		int count;
		
		for(int i= 0; i<wonArray.length; i++) {
			
			count= total/wonArray[i]; //wonArray[i]로 나눴을때 몫 (개수)
			
			System.out.println(wonArray[i]+" : "+count+"개");
			
			total= total%wonArray[i]; // wonArray[i]로 나눈뒤 나머지			
		}
		sc.close();
	}
}
