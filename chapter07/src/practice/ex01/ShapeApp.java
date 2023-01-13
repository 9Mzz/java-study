package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

//		아래코드 정상화 방법을 모르겠다..
//		Shape s = new Shape ("빨강"); 
		Circle c1 = new Circle("녹색", 10);
		Rectangle r1 = new Rectangle("빨강", 4, 4);
		Shape sr1 = new Rectangle("빨강", 4, 4);
		
		//sr1을 그리는 메소드 호출
		sr1.draw();
		
		//sr1의 가로크기 출력
		((Rectangle)sr1).getWidth();
		System.out.println("sr1의 가로는 "+((Rectangle)sr1).getWidth());
	}
}

	
	