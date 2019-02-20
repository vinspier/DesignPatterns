package com.fxb.patterns.facade;

import com.fxb.patterns.facade.example.PageMaker;

public class TestFacade {
    public static void main(String[] args) throws  Exception{
        String location = "E:\\GitHub\\DesignPatterns\\DesignPatterns\\src\\com\\fxb\\patterns\\facade\\example\\";
        PageMaker.makePage(location +"page1.html");
        PageMaker.makePage("12345213@qq.com",location +"page2.html");
    }
}
