package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		int[] lotto= new int[6];
		
		for(int i= 0; i<lotto.length; i++) {
			lotto[i]= (int)(Math.random()*45)+1; // i번 로또
			
			if(i>0) { // 2번째 로또번호부터 작동
				for(int a= 0; a<i; a++) {
					if(lotto[i]==lotto[a]) { // 중복검사
						i--;
						break;
					}
				}	
			}
		}
		for(int i= 0; i<lotto.length; i++) {
			System.out.print(lotto[i]+"\t");
		}
	}
}


