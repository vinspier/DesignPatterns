package com.fxb.patterns.abstractFactory.example1.factory;


import com.fxb.patterns.abstractFactory.example1.product.BaseProduct;

public interface BaseFactory {
    BaseProduct createProduct(String name);
}
