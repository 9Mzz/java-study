package com.javaex.ex04;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
//		HashSet 을 이용해서 로또 자동생성기 (랜덤함수 이용)
		
		
		Set<Integer> iSet = new HashSet<Integer>();
//		위내용을 이렇게 써도 된다 HashSet<Integer> iSet = new HashSet<Integer>();
		
		while(true) {
			if (iSet.size() >= 6) { //6개면 탈출 
				break;
			}
			int num = (int)(Math.random()*45)+1;
			System.out.println("생성된 숫자 : "+ num);
			iSet.add(num); //중복 체크는 Set을 통해 해결
		}
		
		for (int no : iSet) { //언박싱
			System.out.print(no+" ");
		}
		
		
		/* do while 로 표현 동작 이상
		do {
			int num = (int)(Math.random()*45)+1;
			System.out.println("생성된 숫자 : "+ num);
			iSet.add(num); //중복 체크는 Set을 통해 해결
		}
		while (iSet.size() >= 6); //6개면 탈출
		
		*/
		
		
		
		/* 내가 만들어본 로또
		Random random = new Random();
		random.setSeed(System.currentTimeMillis()); //현재 시간을 바탕으로 랜덤 숫자
//		System.out.println("46 미만의 랜덤 정수 리턴 : " + random.nextInt(46));
		
		Set<Integer> iSet = new HashSet<Integer>();
		
		Integer i01 = new Integer(random.nextInt(46));
		Integer i02 = new Integer(random.nextInt(46));
		Integer i03 = new Integer(random.nextInt(46));
		Integer i04 = new Integer(random.nextInt(46));
		Integer i05 = new Integer(random.nextInt(46));
		Integer i06 = new Integer(random.nextInt(46));
		
		System.out.println("자바 이클립스에서 로또645 예상 번호를 알려드립니다");
		System.out.println("이번 로또 행운의 숫자는....");
		System.out.println(i01+", "+i02+", "+i03+", "+i04+", "+i05+", "+i06+" 행운을 빕니다.");

		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);
		iSet.add(i04);
		iSet.add(i05);
		iSet.add(i06);
		
		System.out.println("iSet갯수: " + iSet.size()); 
		*/
		
		
		
		
		/*
		System.out.println("----------------------------------");
		
		System.out.println("0.0 ~ 1.0 사이의 난수 1개 발생 : " + Math.random());
		System.out.println("0 ~ 10 사이의 난수 1개 발생 : " + (int)((Math.random()*10000)%10));
	    System.out.println("0 ~ 100 사이의 난수 1개 발생 : " + (int)(Math.random()*100));
	    */
	       
	}

}
