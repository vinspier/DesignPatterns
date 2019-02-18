package com.fxb.patterns.ChainOfResponsibility.example;

/**
 *
 * 处理者抽象类 定义处理请求的接口API 知道下一个处理者
 * 如果自己无法处理 就 “推卸”给下一个处理者做
 * */
public abstract class Support {

    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support next(Support support){
        this.next = support;
        return next;
    }

    /** 解决问题的步骤 */
    public final void support(Trouble t){
        if (resolve(t))
            done(t);
        else if (next != null)
            next.support(t);
        else
            fail(t);
    }

    /** 判断问题能否被解决 */
    protected abstract boolean resolve(Trouble t);

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
