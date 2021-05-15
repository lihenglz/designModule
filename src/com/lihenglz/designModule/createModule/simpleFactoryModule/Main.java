package com.lihenglz.designModule.createModule.simpleFactoryModule;

public class Main {

    public static void main(String[] args) {

//        Pay pay = SimpleFactory.createPay("WECHAT_PAY");
        Pay pay = SimpleFactory.createPay("ALI_PAY");
        pay.unifiedorder();

    }
}
