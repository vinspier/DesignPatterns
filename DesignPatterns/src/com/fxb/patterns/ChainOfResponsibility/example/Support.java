package com.fxb.patterns.ChainOfResponsibility.example;

/**
 * 定义 责任行为API
 *
 * @author  vinspier
 * @date    2021/9/13 10:28 上午
 * @version 1.0
 * @menu
*/
public interface Support {

    /**
     * 处理问题入口
     *
     * @param t 问题
     */
    void resolve(Trouble t);

}
