package com.lihenglz.designModule.createModule.abstractFactory.ali;

import com.lihenglz.designModule.createModule.abstractFactory.OrderFactory;
import com.lihenglz.designModule.createModule.abstractFactory.PayFactory;
import com.lihenglz.designModule.createModule.abstractFactory.RefundFactory;

public class AliOrderFactory implements OrderFactory {
    @Override
    public PayFactory createPay() {
        return new AliPay();
    }

    @Override
    public RefundFactory createRefund() {
        return new AliRefund();
    }
}
