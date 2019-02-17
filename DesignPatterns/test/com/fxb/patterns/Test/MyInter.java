package com.fxb.patterns.Test;

@FunctionalInterface
public interface MyInter {
    void method();
    default int method1(){
        return 1;
    }
}
