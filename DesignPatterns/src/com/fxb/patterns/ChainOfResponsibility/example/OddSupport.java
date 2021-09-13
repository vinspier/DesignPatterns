package com.fxb.patterns.ChainOfResponsibility.example;

/**
 *
 * 具体处理者 3
 * 只处理问题编号为奇数的问题
 * */
public class OddSupport extends AbstractSupport {

    public OddSupport(String name) {
        super(name);
    }

    @Override
    public boolean support(Trouble t) {
        if (t.getNo() % 2 == 1)
            return true;
        else
            return false;
    }
}
