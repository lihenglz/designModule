package com.lihenglz.designModule.createModule.abstractFactory.wechat;

import com.lihenglz.designModule.createModule.abstractFactory.OrderFactory;
import com.lihenglz.designModule.createModule.abstractFactory.PayFactory;
import com.lihenglz.designModule.createModule.abstractFactory.RefundFactory;

public class WechatOrderFactory implements OrderFactory {
    @Override
    public PayFactory createPay() {
        return new WechatPay();
    }

    @Override
    public RefundFactory createRefund() {
        return new WechatRefund();
    }
}
