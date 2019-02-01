package com.fxb.patterns.prototype.example;

/**
 * 具体原型类
 * 实现具体的复制方法 默认是浅复制
 * 若需要实现深复制 重写clone方法 将数组、集合、对象应用的成员变量再次克隆
 * */
public class UnderLine implements Product  {

    /**
     *  基本类型 在复制时 默认的Object中clone会将 基本类型数据的值进行拷贝
     *  数组、集合、对象引用的成员变量拷贝他们的引用，并不会拷贝他们内部的值
     * */
    private String charType;
    private int no;

    public UnderLine(String charType) {
        this.charType = charType;
    }

    @Override
    public void use() {
        System.out.println("############################################");
        System.out.println(charType);
        System.out.println("############################################");

    }

    @Override
    public Product copy() {
        try {
            return (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        UnderLine u = null;
        u = (UnderLine)super.clone();
        u.charType = this.charType;
        return u;
    }

    public String getCharType() {
        return charType;
    }

    public void setCharType(String charType) {
        this.charType = charType;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}
