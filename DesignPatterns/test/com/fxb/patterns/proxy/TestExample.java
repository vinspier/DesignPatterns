package com.fxb.patterns.proxy;

import com.fxb.patterns.proxy.example.PrinterProxy;

public class TestExample {
    public static void main(String[] args) {
        PrinterProxy proxy = new PrinterProxy();
        proxy.setContent("道路千万条，安全第一条，行车不规范，亲人两行泪！");
        proxy.print();
    }
}
