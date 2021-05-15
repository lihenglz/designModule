package com.lihenglz.designModule.createModule.factoryMethod;

public class WechatPayFactory implements PayFactory{
    @Override
    public Pay getPay() {
        return new WechatPay();
    }
}
