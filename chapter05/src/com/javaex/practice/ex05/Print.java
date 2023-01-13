package com.javaex.ex05;

public class Print {
    
    public void printer(int val){
        System.out.println(val);
    }
    
    public void printer(boolean val) {
    	System.out.println(val);
    }

    public void printer(double val) {
    	System.out.println(val);
//    	return; // String int boolean 은 return 사용하는 메서드 void가 있어서 return 안써도 된다.
    }
    
    public String printer(String val) {
    	System.out.println(val);
    	
//    	위 코드와 다르게 void 뺴고 return으로 값을 빼보았다
    	return val;    	
    }
    
//  필드
    private double point;
    private boolean pass;
    private String name;
    
//  생성자

    public Print() {    	
    }
    
	public Print(double point, boolean pass, String name) {
	this.point = point;
	this.pass = pass;
	this.name = name;
}    
    
    
    //메소드  3개 를 작성하세요
    
	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}
	public boolean isPass() {
		return pass;
	}
	public void setPass(boolean pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "Print [point=" + point + ", pass=" + pass + ", name=" + name + "]";
	}
    
    
    
	
}
