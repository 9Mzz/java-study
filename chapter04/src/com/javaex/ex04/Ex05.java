package com.javaex.ex04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex05 {

	public static void main(String[] args) {

//		map
		
//		만약 숫자로 하고 싶다면 int x -> Integer 
		Map<String, Point> pMap = new HashMap<String, Point>();
		
		Point p01 = new Point(1, 11); //권상우
		Point p02 = new Point(2, 34); //정우성
		Point p03 = new Point(3, 85); //이효리
		
		pMap.put("권상우", p01); //pMap에 이름표를 단다 
		pMap.put("정우성", p02);
		pMap.put("이효리", p03); //중복으로 넣으면 나중에 넣은 값으로 찾는다 이효리자리에 권상우 넣으면 권상우로 수정 
		
		System.out.println(pMap.toString());
		
//		배열이라면 방번호로 불러오겠지만 여기서는 get으로 불러온다
		System.out.println(pMap.get("정우성").getX()); 
		
//		내가 몇개의 데이터를 가지고있을까
		System.out.println("데이터 size값 :"+pMap.size());
		System.out.println("-------------------------------");
		
//		키셋구하기 - 키셋은 권상우 정우성 이효리 모음
		Set<String> keys = pMap.keySet();
		
		
		for(String key : keys) {
			System.out.println(pMap.get(keys).getX()); //위의 정우성getX와 비슷
		}
		
//		map을 써보자
		Map<String, String> boardMap = new HashMap<String, String>();
		
		boardMap.put("title", "게시판 제목입니다");
		boardMap.put("regDate", "2021-12-08");
		boardMap.put("content", "게시판 내용입니다");
		
		System.out.println(boardMap.get("title"));
		
		
	}

}
