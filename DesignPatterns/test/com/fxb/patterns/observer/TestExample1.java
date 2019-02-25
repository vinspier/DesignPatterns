package com.fxb.patterns.observer;

import com.fxb.patterns.observer.example1.Generator;
import com.fxb.patterns.observer.example1.GraphicsObserver;
import com.fxb.patterns.observer.example1.NumberObserver;
import com.fxb.patterns.observer.example1.RandomNumberGenerator;

public class TestExample1 {

    public static void main(String[] args) {
        Generator generator = new RandomNumberGenerator();
        generator.put(new NumberObserver());
        generator.put(new GraphicsObserver());
        generator.change();
    }

}
