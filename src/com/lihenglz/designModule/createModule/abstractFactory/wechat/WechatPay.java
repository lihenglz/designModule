package com.lihenglz.designModule.createModule.abstractFactory.wechat;

import com.lihenglz.designModule.createModule.abstractFactory.PayFactory;

public class WechatPay implements PayFactory {
    @Override
    public void unifiedorder() {
        System.out.println("微信支付 统一下单接口");
    }
}
