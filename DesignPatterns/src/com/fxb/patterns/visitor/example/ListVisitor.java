package com.fxb.patterns.visitor.example;


import java.util.Iterator;

/**
 *
 * 具体访问者类
 * 实现访问数据结构的接口具体实现
 * */
public class ListVisitor implements Visitor {
    private String currentName = "";

    @Override
    public void visit(File file) {
        System.out.println(currentName + "/" + file.toString());
    }

    @Override
    public void visit(Directory dir) {
        System.out.println(currentName + "/" + dir.toString());
        //临时存储当前文件路径
        String tempName = currentName;
        //下一级文件夹获取路径以当前路径为基础
        currentName += "/" + dir.getName();
        Iterator<Entry> it = dir.iterator();
        while (it.hasNext()){
            Entry entry = it.next();
            entry.accept(this);
        }
        //复位文件路径
        currentName = tempName;
    }
}
