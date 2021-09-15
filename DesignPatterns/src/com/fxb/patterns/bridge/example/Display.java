package com.fxb.patterns.bridge.example;
/**
 *
 * 顶层 功能层次结构
 *
 * 定义类的功能接口
 * 新的功能可在子类中添加
 * */
public class Display {
    /** 使用委托方式 将类的实现层次结构引入到此类定义的功能接口中 */
    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open(){
        impl.rawOpen();
    }

    public void print(){
        impl.rawPrint();
    }

    public void close(){
        impl.rawClose();
    }

    public final void display(){
        open();
        print();
        close();
    }
}
