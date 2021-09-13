package com.fxb.patterns.ChainOfResponsibility;

import com.fxb.patterns.ChainOfResponsibility.example.*;

public class TestChainResponsibility {
    public static void main(String[] args) {
        /**
         * 定义责任处理者
         * */
        AbstractSupport noSupport = new NoSupport("NoSupport");
        AbstractSupport limitSupport = new LimitSupport("limitSupport",100);
        AbstractSupport oddSupport = new OddSupport("oddSupport");
        AbstractSupport specialSupport = new SpecialSupport("specialSupport",330);

        /**
         * 设置责任链 可以随需求的变化而调整
         * */
        noSupport.next(limitSupport).next(oddSupport).next(specialSupport);

        /**
         * 产生问题
         * */
        for (int i = 0; i < 500; i += 33){
            Trouble trouble = new Trouble(i);
            noSupport.resolve(trouble);
        }

    }
}
