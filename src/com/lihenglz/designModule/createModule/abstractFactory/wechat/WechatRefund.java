package com.lihenglz.designModule.createModule.abstractFactory.wechat;

import com.lihenglz.designModule.createModule.abstractFactory.RefundFactory;

public class WechatRefund implements RefundFactory {
    @Override
    public void refund() {
        System.out.println("微信退款");
    }
}
