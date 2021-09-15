package com.fxb.patterns.bridge.example;

/**
 *
 * "类的实现层次结构" 中的具体实现类
 * */
public class NumberDisplayImpl implements DisplayImpl {

    private int number;

    public NumberDisplayImpl(int number) throws Exception{
        if (number < 0)
            throw new Exception("构造方法传入的初始值必须为一个非负整数");
        this.number = number;
    }

    /** 类的功能实现 创建子类 具体的实现在此类中实现 若需要不同的实现 创建新类实现相同父类编写具体的实现 */
    @Override
    public void rawOpen() {
        printLine("开始打印");
    }

    @Override
    public void rawPrint() {
        for( int i = 0; i < number; i++){
            if( i != 0 && i % 20 == 0)
                System.out.println( i + "");
            else
                if(i == number - 1 && number / 20 != 0)
                    System.out.println(i + "");
                else
                    System.out.print(i + "");
        }
    }

    @Override
    public void rawClose() {
        printLine("开始打印");
    }

    public void printLine(String s){
        System.out.println("************" + s +"************");
    }
}
