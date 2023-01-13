package com.javaex.ex04;

public class Base {
    
		
//	필드
	
	
//	낮 밤 오후 구분 
    public void service(String state) {
    	
//    	다른사람의 해결법도 체크해보자
    	if(state.equals("낮")) {
        	day();
        }
        else if(state.equals("밤")) {
        	night();
        }
        else if(state.equals("오후")) {
        	afternoon();
        }
    	
    	System.out.println("파라미터3");
    	
        //코드작성할것
        	
    }

    

	
//	매서드 일반
	public void day() {
        System.out.println("낮에는 열심히 수업듣자");
    }

    public void night() {
        
    	//코드작성할것
    	System.out.println("밤에는 숙면");
    }
    
    public void afternoon(){
        System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    }


	@Override
	public String toString() {
		return "Base [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


	
    
   
}

