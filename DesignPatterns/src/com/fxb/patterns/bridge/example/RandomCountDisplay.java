package com.fxb.patterns.bridge.example;

/**
 * "类的功能层次结构" 的次次级新增功能类
 * */
import java.util.Random;

public class RandomCountDisplay extends LimitCountDisplay {

    public RandomCountDisplay(DisplayImpl impl) {
        super(impl);
    }

    /** 新功能的实现 创建新的子类 在此类中实现 若需要其他的新功能 可在此类中或再创建子类继承该类增加 */
    public  void randomCountDisplay(int times) throws Exception{
        limitedDisplay(new Random(times).nextInt());
    }
}
