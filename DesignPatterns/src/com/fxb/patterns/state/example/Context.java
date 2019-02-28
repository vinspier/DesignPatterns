package com.fxb.patterns.state.example;

/**
 *
 * 定义 依赖当前状态的做出相应处理的接口API
 * 对外提供了设置修改当前状态的开放接口
 * */
public interface Context {
    void setClock(int hour);                // 设置时间
    void changeState(State state);          // 改变状态
    void callSecurityCenter(String msg);    // 联系警报中心
    void recordLog(String msg);             // 在警报中心留下记录
}
