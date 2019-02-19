package com.fxb.patterns.facade;

import com.fxb.patterns.facade.example.PageMaker;

public class TestFacade {
    public static void main(String[] args) throws  Exception{
        PageMaker.makePage("html1");
        PageMaker.makePage("12345213@qq.com","html2");
    }
}
