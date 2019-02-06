package com.fxb.patterns.abstractFactory.example1.user;


import com.fxb.patterns.abstractFactory.example1.factory.BaseFactory;
import com.fxb.patterns.abstractFactory.example1.factory.Factory_A;
import com.fxb.patterns.abstractFactory.example1.factory.Factory_B;
import com.fxb.patterns.abstractFactory.example1.product.Product_A;
import com.fxb.patterns.abstractFactory.example1.product.Product_B;

public class Customer {
    public static void main(String[] args) throws NoSuchFieldException{
        BaseFactory fa = new Factory_A();
        Product_A pa = (Product_A) fa.createProduct("汽车");
        pa.use();
        BaseFactory fb = new Factory_B();
        Product_B pb = (Product_B) fb.createProduct("自行车");
        pb.use();
    }
}
