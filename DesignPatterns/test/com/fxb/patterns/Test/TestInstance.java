package com.fxb.patterns.Test;

public class TestInstance {
    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.setAge(10);
        t.setName("fxb");
        System.out.println(t.getAge());
        System.out.println(t.getName());
        System.out.println("************************");
        try {
            /** 克隆模式不会进入构造方法 */
            TestClass tClone = (TestClass)t.clone();
            System.out.println(tClone.getAge());
            System.out.println(tClone.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("************************");
        try {
            /** 反射创建实例 会调用构造方法 初始化成员变量为默认值 */
            TestClass tNew = t.getClass().newInstance();
            System.out.println(tNew.getAge());
            System.out.println(tNew.getName());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
