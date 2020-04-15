package com.fxb.patterns.adapter.executor;

/**
 * @ClassName: ExecuteService
 * @Description: 定义附加的一些行为
 * @Author:
 * @Date: 2020/4/15 12:36
 * @Version V1.0
 **/
public interface AuditorService<I,O> extends Auditor<I,O> {

    /**
     * 提交一个任务
     * */
    O submit(I o);

}
