package com.fxb.patterns.Test;

public class TestClass implements Cloneable{
    private int age;
    private String name;

    public TestClass() {
        System.out.println("进入无参构造方法，创建实例");
    }

    public TestClass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
