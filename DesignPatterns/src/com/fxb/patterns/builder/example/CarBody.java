package com.fxb.patterns.builder.example;

public class CarBody {
    private String name;

    public CarBody() {
    }

    public CarBody(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
