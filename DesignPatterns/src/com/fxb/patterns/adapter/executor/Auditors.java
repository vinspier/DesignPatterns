package com.fxb.patterns.adapter.executor;

/**
 * @ClassName: Executors
 * @Description: 创建者
 * 在这里定义 具体创建那些最终审核执行者
 * @Author:
 * @Date: 2020/4/15 15:02
 * @Version V1.0
 **/
public class Auditors {

    /**
     * 创建系统审核 执行者
     * */
    public static SysAuditor sysAuditor(){
        return new SysAuditor();
    }

}
