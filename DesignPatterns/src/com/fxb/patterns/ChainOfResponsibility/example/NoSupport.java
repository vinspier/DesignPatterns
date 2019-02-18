package com.fxb.patterns.ChainOfResponsibility.example;

/**
 *
 * 具体处理者 1
 * 不做任何处理
 * */
public class NoSupport extends Support {

    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble t) {
        return false;
    }


}
