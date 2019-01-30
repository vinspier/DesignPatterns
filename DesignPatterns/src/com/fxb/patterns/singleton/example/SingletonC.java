package com.fxb.patterns.singleton.example;

/**
 * 单例模式三
 * 懒汉 双重检查 线程安全
 * */
public class SingletonC {
    /**
     * 定义成静态类变量 当第一次访问该变量时 促使类被加载并初始化该变量
     * final 需要时可以静止指令重排序 在定义是必须被赋值
     * */
    private static SingletonC instance;

    /** 构造器私有化 禁止除了以下的入口外其他方法产生实例 */
    private SingletonC() {
    }

    /** 对外开发 生成实例的唯一入口 入口内部双重检查 */
    public static SingletonC createInstance(){
        if (instance == null){
            synchronized(SingletonC.class){
                if (instance == null){
                    instance = new SingletonC();
                }
            }
        }
        return instance;
    }

}
