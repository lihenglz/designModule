package com.lihenglz.designModule.createModule.factoryMethod;

public class Main {

    public static void main(String[] args) {
        PayFactory aliPayFactory = new AliPayFactory();
        Pay aliPay = aliPayFactory.getPay();
        aliPay.unifiedorder();

        PayFactory wechatPayFactory = new WechatPayFactory();
        Pay wechatPay = wechatPayFactory.getPay();
        wechatPay.unifiedorder();
    }

}
