package com.fxb.patterns.bridge.example;
/**
 *
 * 顶层的 "类的实现结构层次" 类
 * 定义 类的功能层次类中的 功能接口
 * 定义 类的实现接口API 具体实现在子类中实现
 * */
public abstract class DisplayImpl {
    public abstract void rawOpen();
    public abstract void rawPrint();
    public abstract void rawClose();
}
