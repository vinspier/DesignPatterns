package com.fxb.patterns.ChainOfResponsibility;

import com.fxb.patterns.ChainOfResponsibility.example.AbstractSupport;
import com.fxb.patterns.ChainOfResponsibility.example.Trouble;


/**
 *
 * 具体处理者 2
 * 只处理问题编号为指定值的问题
 * */
public class SpecialSupport extends AbstractSupport {

    /**
     * 内部特殊字段
     * */
    private int special;

    public SpecialSupport(String name, int special) {
        super(name);
        this.special = special;
    }

    @Override
    public boolean support(Trouble t) {
        if (t.getNo() == special)
            return true;
        else
            return false;
    }
}
