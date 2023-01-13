package com.javaex.ex06;
//	수정하지 않습니다
public class BaseApp {

    public static void main(String[] args) {

        Base base = new MyBase();
        base.service("낮");
        base.service("밤");
        base.service("오후");
    }

}
