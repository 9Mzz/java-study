package com.javaex.ex03;

public class Shape {
	
	protected String fillColor;
	protected String lineColor;

	
//	생성자 컨스트럭터
	public Shape() { }
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}


//	메서드 gs
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}


//	메서드 일반
	public void showInfo() {
		System.out.println("면색은 "+fillColor+"선색은 "+lineColor+" 입니다");
	}
	

}

