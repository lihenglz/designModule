package com.lihenglz.designModule.structureModule.adapterModule.interfaceAdapterModule;

public class Main {

    public static void main(String[] args) {
        ProductVideoOrder productVideoOrder = new ProductVideoOrder();
        productVideoOrder.unifiedorder();
        productVideoOrder.refund();

        ProductVideoVipOrder productVideoVipOrder = new ProductVideoVipOrder();
        productVideoVipOrder.unifiedorder();
        productVideoVipOrder.refund();
        productVideoVipOrder.sendRedPack();
    }

}
