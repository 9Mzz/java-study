package com.javaex.ex01;

public class Rectangle extends Shape {
	
	private int width;
	private int height;
	
	public Rectangle(String fillColor, int width, int height){
		super(fillColor);
		this.width=width;
		this.height=height;
	}
	
	
	
public final int getWidth() {
		return width;
	}


	public final void setWidth(int width) {
		this.width = width;
	}


	public final int getHeight() {
		return height;
	}


	public final void setHeight(int height) {
		this.height = height;
	}

	
	

	//	public void showInfo(){ 문자열 변경
	public void draw(){
		System.out.println("[사각형]#면색:" +super.fillColor+ " "
				+ " #가로:" + width 
				+" #세로:" + height + "그렸습니다.");                                                                        
	}
		

}


