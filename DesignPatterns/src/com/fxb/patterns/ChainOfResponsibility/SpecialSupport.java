package com.fxb.patterns.ChainOfResponsibility;

import com.fxb.patterns.ChainOfResponsibility.example.Support;
import com.fxb.patterns.ChainOfResponsibility.example.Trouble;


/**
 *
 * 具体处理者 2
 * 只处理问题编号为指定值的问题
 * */
public class SpecialSupport extends Support{

    private int special;

    public SpecialSupport(String name, int special) {
        super(name);
        this.special = special;
    }

    @Override
    protected boolean resolve(Trouble t) {
        if (t.getNo() == special)
            return true;
        else
            return false;
    }
}
