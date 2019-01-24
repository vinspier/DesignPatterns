package com.fxb.patterns.iterator.simpleDemo;

/**
 * 实体类  被存储在集合或数组里的基本单元
 * */
public class Book {

    private String name;
    private String author;
    private String cost;

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, String author, String cost) {
        this.name = name;
        this.author = author;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
