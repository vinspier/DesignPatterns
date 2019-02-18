package com.fxb.patterns.ChainOfResponsibility.example;

/**
 *
 * 具体处理者 2
 * 只处理问题编号小于限制limit的问题
 * */
public class LimitSupport extends Support {

    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble t) {
        if(t.getNo() < limit)
            return true;
        else
            return false;
    }
}
