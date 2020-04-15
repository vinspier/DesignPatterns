package com.fxb.patterns.adapter.executor;

/**
 * @ClassName: Executor
 * @Description: 执行器 定义最定义统一行为
 * 定义审核接口
 * @Author:
 * @Date: 2020/4/15 12:24
 * @Version V1.0
 **/
public interface Auditor<I,O> {

    /**
     * I 输入参数类型
     * O 输出参数类型
     * */
    O execute(I i);

}
