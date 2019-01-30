package com.fxb.patterns.singleton.example;

/**
 * 单例模式五
 * 静态内部类 线程安全
 * */
public class SingletonE {

    /** 定义静态内部类 当第一次访问该内部类的静态变量时 类首次被加载并初始化该变量 */
    private static class Internal {
        private static final SingletonE instance = new SingletonE();
    }

    /** 对外开发 生成实例的唯一入口 访问内部类的静态变量*/
    public static SingletonE createInstance(){
        return Internal.instance;
    }

}
