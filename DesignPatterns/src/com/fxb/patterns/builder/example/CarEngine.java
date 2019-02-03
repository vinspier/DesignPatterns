package com.fxb.patterns.builder.example;

public class CarEngine {
    private String name;

    public CarEngine() {
    }

    public CarEngine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
