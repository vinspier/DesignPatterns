package com.fxb.patterns.ChainOfResponsibility.example;

/**
 *
 * 具体处理者 1
 * 不做任何处理
 * */
public class NoSupport extends AbstractSupport {

    public NoSupport(String name) {
        super(name);
    }

    @Override
    public boolean support(Trouble t) {
        return false;
    }


}
