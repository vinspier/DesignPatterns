package com.fxb.patterns.builder.example;

public class CarSecuritySystem {
    private String name;

    public CarSecuritySystem() {
    }

    public CarSecuritySystem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
