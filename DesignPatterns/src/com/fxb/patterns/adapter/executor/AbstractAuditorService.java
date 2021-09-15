package com.fxb.patterns.adapter.executor;

/**
 * @ClassName: AbstractExecuteService
 * @Description: 任务执行抽象类
 * @Author:
 * @Date: 2020/4/15 12:44
 * @Version V1.0
 **/
public abstract class AbstractAuditorService<I,O> implements AuditorService<I,O> {

    /**
     * 丢入一个任务i
     * */
    @Override
    public O submit(I i) {
        if (null == i){
            throw new NullPointerException("任务参数i不可为空");
        }
        return execute(i);
    }

}
