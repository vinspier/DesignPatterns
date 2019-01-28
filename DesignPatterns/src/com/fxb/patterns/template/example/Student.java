package com.fxb.patterns.template.example;

/**
 * 具体子类 继承定义了处理流程的逻辑框架
 * 具体实现在此类编写
 * */
public class Student extends AbstractPerson {

    @Override
    protected void wash() {
        System.out.println("用学生洗面奶洗脸");
    }

    @Override
    protected void dressUp() {
        System.out.println("穿上校服");
    }

    @Override
    protected void breakfast() {
        System.out.println("在家吃早餐");
    }

    @Override
    protected void books() {
        System.out.println("拿上学习的书本");
    }
}
