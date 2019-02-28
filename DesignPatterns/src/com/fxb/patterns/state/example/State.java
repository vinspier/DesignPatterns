package com.fxb.patterns.state.example;
/**
 *
 *定义所有不同具体状态类的处理接口API
 * */
public interface State {
    void doClock(Context context, int hour);    // 设置时间
    void doUse(Context context);                // 使用金库
    void doAlarm(Context context);              // 按下警铃
    void doPhone(Context context);              // 正常通话
}
