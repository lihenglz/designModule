package com.lihenglz.designModule.createModule.abstractFactory.ali;

import com.lihenglz.designModule.createModule.abstractFactory.RefundFactory;

public class AliRefund implements RefundFactory {
    @Override
    public void refund() {
        System.out.println("阿里退款");
    }
}
