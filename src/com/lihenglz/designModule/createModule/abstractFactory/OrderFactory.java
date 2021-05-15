package com.lihenglz.designModule.createModule.abstractFactory;

/**
 *
 */
public interface OrderFactory {


    PayFactory createPay();

    RefundFactory createRefund();


}
