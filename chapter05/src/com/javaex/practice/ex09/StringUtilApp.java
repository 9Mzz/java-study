package com.javaex.ex09;

public class StringUtilApp {

	/*
	1 String 배열 타입의 파라미터를 받습니다.
	2 인자로 받은 문자열 배열 요소를 하나의 문자열로 결합하고, 결과 문자열을 리턴 합니다.
	3. 주어진 클래스명과 메소드는 변경하지 않습니다.
	*/
	
    public static void main(String[] args) {

//    	배열 입력에 2가지 방법있음. 한줄한줄 써내려가는 방법, 아래와 같이 일렬로 나열 작성 방법
        
    	String[] strArray = {"SuperMan", "BatMan", "SpiderMan"};
//    	String[] strArray = new String[] {"SuperMan", "BatMan", "SpiderMan"};
        String resultStr = StringUtil.concatString(strArray);
        
        System.out.println("결과 문자열:" + resultStr);
        
        
    }

}
