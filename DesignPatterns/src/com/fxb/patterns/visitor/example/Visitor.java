package com.fxb.patterns.visitor.example;

/**
 *
 * 抽象访问者接口
 * 定义访问数据结构的接口API
 * */
public interface Visitor {
    void visit(File file);
    void visit(Directory dir);
}
