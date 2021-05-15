package com.lihenglz.designModule.createModule.factoryMethod;

public class AliPayFactory implements PayFactory{


    @Override
    public Pay getPay() {
        return new AliPay();
    }
}
