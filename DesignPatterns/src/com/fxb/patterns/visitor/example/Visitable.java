package com.fxb.patterns.visitor.example;

/**
 *
 * 元素接口
 * 定义接受所需的访问者
 * */
public interface Visitable {
    void accept(Visitor v);
}
