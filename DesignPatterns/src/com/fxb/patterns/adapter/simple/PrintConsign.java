package com.fxb.patterns.adapter.simple;


/**
 * 具体目标类
 *     创建组件类的对象作为该类的实例，结合自己的方法和调用组件类对象（实例）
 * 的方法 来实现特定需要的方法
 * */
public class PrintConsign implements Print{

    private Calculator calculator;

    public PrintConsign() {

    }

    /** 需要事项的目标方法 打印 0 到 输入值number的总和值 和 倒叙打印每一项的值*/
    public PrintConsign(Calculator calculator) {
        this.calculator = calculator;
    }

    /** 此类定义的特定方法 打印 0 到 number的值 */
    @Override
    public void printCalculate(int number) {
        System.out.println(calculator.calculate(number));
        for(int i = number; i > 0 ; i--){
            System.out.print(i + " ");
        }
    }
}
