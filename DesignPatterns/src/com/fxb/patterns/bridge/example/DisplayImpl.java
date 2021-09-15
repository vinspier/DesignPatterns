package com.fxb.patterns.bridge.example;
/**
 *
 * 顶层 实现结构
 *
 * 定义 功能行为 接口
 *
 * 具体实现在子类中实现
 * */
public interface DisplayImpl {
    void rawOpen();
    void rawPrint();
    void rawClose();
}
