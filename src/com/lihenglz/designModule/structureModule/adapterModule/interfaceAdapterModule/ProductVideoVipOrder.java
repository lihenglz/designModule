package com.lihenglz.designModule.structureModule.adapterModule.interfaceAdapterModule;

public class ProductVideoVipOrder extends PayGatewayAdapter {

    @Override
    public void unifiedorder() {
        System.out.println("ProductVideoVipOrder unifiedorder");
    }

    @Override
    public void refund() {
        System.out.println("ProductVideoVipOrder refund");
    }

    @Override
    public void sendRedPack() {
        System.out.println("ProductVideoVipOrder sendRedPack");
    }
}
