package com.fxb.patterns.factory.example;


/**
 * 具体工厂工厂类 根据不同的需求
 * 此类进行特定方法的实现
 * */
public class ConcreteFactoryB extends BaseFactory {

    @Override
    public BaseProduct createProduct() {
        ProductB bp =  new ProductB("产品B");
        products.add(bp);
        return bp;
    }

    @Override
    public void registerProduct(BaseProduct bp) {
        bp.setCode("sdfghjfdsa--" + bp.getName());
    }

}
