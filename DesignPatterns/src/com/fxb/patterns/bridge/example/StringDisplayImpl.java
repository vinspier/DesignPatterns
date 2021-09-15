package com.fxb.patterns.bridge.example;

/**
 *
 * "类的实现层次结构" 中的具体实现类
 * */
public class StringDisplayImpl implements DisplayImpl {
    private String target;
    private int width;

    public StringDisplayImpl(String target) {
        this.target = target;
        this.width = this.target.getBytes().length;
    }

    /** 类的功能实现 创建子类 具体的实现在此类中实现 若需要不同的实现 创建新类实现相同父类编写具体的实现 */
    @Override
    public void rawOpen() {
        printLine("开始打印");
    }

    @Override
    public void rawPrint() {
        System.out.print("+|  ");
        System.out.print(target);
        System.out.println("  |+");
    }

    @Override
    public void rawClose() {
        printLine("结束打印");
    }

    public void printLine(String s){
        System.out.print("**");
        for (int i = 0; i < width; i++){
            if (i == width / 2)
                System.out.print(s);
            System.out.print("*");
        }
        System.out.println("**");
    }
}
