package com.fxb.patterns.singleton.example;

/**
 * 单例模式三
 * 懒汉 双重检查 线程不安全
 * */
public class SingletonC {
    /**
     * 定义成静态类变量 当第一次访问该变量时 促使类被加载并初始化该变量
     * final 需要时可以静止指令重排序 在定义是必须被赋值
     * */
    // private static volatile SingletonC instance;
    private static SingletonC instance;

    /** 构造器私有化 禁止除了以下的入口外其他方法产生实例 */
    private SingletonC() {
    }

    /** 对外开发 生成实例的唯一入口 入口内部双重检查 */
    /**
     * 不安全的原因：由于第一次判断是从主内存中读取变量的值
     * 虽然在下一步中加入了同步synchronized但是当赋值后刷新回主内存后对其他线程已经读取到的值
     * 并不能通知其重新读取主内存中的值 而导致进行了多次创建操作 打破了原需求的单例要求
     *
     * 当加了volatile关键后 在一个线程修改后会立刻刷新到主内存中后
     * 会使其他线程对该变量未使用前失效 重新读取主内存中的值
     * */
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

    /**
     * 直接对方法进行同步
     * */
    public synchronized static SingletonC createInstance1(){
        if (instance == null){
            instance = new SingletonC();
        }
        return instance;
    }

}
