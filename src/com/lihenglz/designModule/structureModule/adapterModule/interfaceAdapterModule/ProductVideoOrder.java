package com.lihenglz.designModule.structureModule.adapterModule.interfaceAdapterModule;

public class ProductVideoOrder extends PayGatewayAdapter {

    @Override
    public void unifiedorder() {
        System.out.println("ProductVideoorder unifiedorder");
    }

    @Override
    public void refund() {
        System.out.println("ProductVideoorder refund");
    }
}
