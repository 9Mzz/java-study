package com.javaex.ex06;

public class MyBase extends Base {

    //코드작성
//	같은 엘리먼트를 사용했을때 오버라이딩 되는 것을 알아보라고 낸 문제인듯
	   public void service(String state) {
		   if (state.equals("낮")) { //문자열의 같다(==) 는 equals()를 사용합니다.
           day();
		   } else if (state.equals("밤")) {
           super.night();
		   } else {
    	   System.out.println("오후도 낮과 마친가지로 공부해야 합니다");
		   }
	   }


    public void day() {
        System.out.println("낮에는 열심히 수업듣자");
    }

    public void night() {
    	System.out.println("밤에는 숙면");
    }


}
	   