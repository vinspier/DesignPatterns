package com.fxb.patterns.abstractFactory.example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 * 抽象产品类
 * */
public abstract class Page {
    protected String title;
    protected String author;
    protected ArrayList<Item> items = new ArrayList<Item>();

    public Page() {
    }

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item){
        items.add(item);
    }

    public void output(){
        try {
            String filename = title + ".html";
            Writer writer = new FileWriter(filename);
            writer.write(makeHtml());
            writer.close();
            System.out.println(filename + "编写完成!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHtml();
}
