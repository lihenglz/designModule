package com.lihenglz.designModule.createModule.abstractFactory;

public class Main {

    public static void main(String[] args) {
        OrderFactory wechatOrderFactory = FactoryProducer.getFactory("WECHAT");
        wechatOrderFactory.createPay().unifiedorder();
        wechatOrderFactory.createRefund().refund();

        OrderFactory aliOrderFactory = FactoryProducer.getFactory("ALI");
        aliOrderFactory.createPay().unifiedorder();
        aliOrderFactory.createRefund().refund();
    }
}
