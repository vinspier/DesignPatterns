package com.fxb.patterns.template.example;


/**
 * 抽象父类
 * 定义 所有子类共有通用的 逻辑处理框架
 * 具体的实现交给子类去实现
 * */
public abstract class AbstractPerson {

    /** 定义处理框架方法 对调用者开发  若不允许子类拓展用final修饰 **/
    public final void prepareGoToSchool(){
        dressUp();
        wash();
        breakfast();
        books();
    }
/********************定义处理流程的各个子步骤 若不想对调用者开发 可使用修饰符定义访问范围****/
    protected abstract void wash();

    protected abstract void dressUp();

    protected abstract void breakfast();

    protected abstract void books();
/********************************************************************************************/
}