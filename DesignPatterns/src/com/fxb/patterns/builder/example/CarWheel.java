package com.fxb.patterns.builder.example;

public class CarWheel {
    private String name;

    public CarWheel() {
    }

    public CarWheel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
