package com.fxb.patterns.bridge.example;

public class LimitCountDisplay extends Display {

    public LimitCountDisplay(DisplayImpl impl) {
        super(impl);
    }

    /** 新功能的实现 创建新的子类 在此类中实现 若需要其他的新功能 可在此类中或再创建子类继承该类增加 */
    public void limitedDisplay(int count) throws Exception{
        if (count < 0)
            throw new Exception("指定的打印次数必须为一个正整数");
        open();
        for (int i = 0; i < count; i++){
            print();
        }
        close();
    }
}
