package com.fxb.patterns.adapter;

import com.fxb.patterns.adapter.simple.Calculator;
import com.fxb.patterns.adapter.simple.PrintConsign;
import com.fxb.patterns.adapter.simple.PrintExtend;

public class TestAdapter {
    public static void main(String[] args) {
        PrintExtend pe = new PrintExtend();
        PrintConsign pc = new PrintConsign(new Calculator());
        System.out.println("-------------------继承方式的适配开始");
        pe.printCalculate(20);
        System.out.println();
        System.out.println("-------------------继承方式的适配结束");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("-------------------委托方式的适配开始");
        pc.printCalculate(20);
        System.out.println();
        System.out.println("-------------------委托方式的适配结束");
    }
}
