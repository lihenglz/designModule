package com.lihenglz.designModule.createModule.abstractFactory.ali;

import com.lihenglz.designModule.createModule.abstractFactory.PayFactory;

public class AliPay implements PayFactory {
    @Override
    public void unifiedorder() {
        System.out.println("支付宝支付 统一下单接口");
    }
}
