package com.fxb.patterns.ChainOfResponsibility.example;

/**
 *
 * 问题类 在责任链模式中 需要被处理的问题
 * */
public class Trouble {
    //问题编号
    private int no;

    public Trouble(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    @Override
    public String toString() {
        return "[Trouble " + no + " ]";
    }
}
