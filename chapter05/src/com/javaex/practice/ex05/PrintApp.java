package com.javaex.ex05;

public class PrintApp {

    public static void main(String[] args) {

        Print print = new Print();
        
        print.printer(10);
        print.printer(true);
        print.printer(5.7);
        print.printer("홍길동");
     
        
//        toString으로 데이터 테스트
//        System.out.println(print.toString());
        
    }

}
