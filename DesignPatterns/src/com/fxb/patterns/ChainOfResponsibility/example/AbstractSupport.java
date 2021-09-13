package com.fxb.patterns.ChainOfResponsibility.example;

/**
 *
 * 处理者抽象类
 * 定义基础属性 和 基本接口处理实现
 * 如果自己无法处理 就 “推卸”给下一个处理者做
 * */
public abstract class AbstractSupport {

    private String name;
    private AbstractSupport next;

    public AbstractSupport(String name) {
        this.name = name;
    }

    public AbstractSupport next(AbstractSupport support){
        this.next = support;
        return next;
    }

    /** 解决问题的步骤 */
    public void resolve(Trouble t){
        if (support(t))
            done(t);
        else if (next != null)
            next.resolve(t);
        else
            fail(t);
    }

    /** 判断问题能否被解决 */
    protected boolean support(Trouble t){
        return true;
    }

    protected void done(Trouble t){
        System.out.println(t + " is resolved by " + this + ".");
    }

    protected void fail(Trouble t){
        System.out.println(t + "is can not be resolved !");
    }

    @Override
    public String toString() {
        return "[ " + name + " ]";
    }
}
