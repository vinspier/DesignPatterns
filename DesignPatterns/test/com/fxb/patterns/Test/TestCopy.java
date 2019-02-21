package com.fxb.patterns.Test;

import java.util.ArrayList;

public class TestCopy implements Cloneable{
    private String nane;
    private ArrayList<String> list = new ArrayList<String>();

    public static void main(String[] args) {
        TestCopy t = new TestCopy();
        t.setNane("abc");
        t.add("a").add("b").add("c");
        System.out.println(t.getNane());
        System.out.println(t.getList().size());
        System.out.println("************original*******************");
        try {
            TestCopy tc = (TestCopy)t.clone();
            tc.add("d");
            tc.setNane("cba");
            System.out.println(tc.getNane());
            System.out.println(tc.getList().size());
            System.out.println("************after change*******************");
            System.out.println(t.getNane());
            System.out.println(t.getList().size());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public TestCopy add(String s){
        list.add(s);
        return this;
    }

    public String getNane() {
        return nane;
    }

    public void setNane(String nane) {
        this.nane = nane;
    }

    public ArrayList<String> getList() {
        return list;
    }
}
