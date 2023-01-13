package com.javaex.ex09;

public class StringUtil {
	
//	chapter3까지 진도 나가고 다시 풀어보니 concat 메서드의 공백을 지워주는 기능때문이 이런 이름이 붙었구나 라는 생각이 듬
	public static String concatString(String[] strArray){
//    public static String concatString(){
        //메소드 내용작성
    	
    	
    	String recall=""; //공백을 만들었다
    	
    	//반복시작
    	for(int i=0; i<strArray.length; i++) {
//    		strArray의 갯수만큼 배열을 출력하고 그 사이의 공백을 concat 제거
    		recall = recall+strArray[i];
    		
    	}
    	
    	return recall;

    	
    	
    	/* 여기부터 내 실수를 적어두는 공간
//    	필드
    	private String strArray; 
    	
//    	생성자	
//    	strArray  에서 써준 3개 패러미터를 모아줘
    	
    	public StringUtil() {}
    	
    	public StringUtil(String strArray) {
    		this.strArray = strArray;	
    	*/
    	

    	
//    	여기서 String 패러미터3개 배열을 하나로 묶어주자
//    	근데 묶는 법을 모르겠다 
    	
    	
    	
    	/*
    	for(int i=0; i<this.strArray.length; i++){
    		System.out.print(strArray[i]);
    		}
    	
    	
    	strArray[0] = asd; 
    	strArray[1] = asd;
    	strArray[2] = sdaw;
    	}
    	*/
        	

	}

    

}
