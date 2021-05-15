package com.lihenglz.designModule.structureModule.adapterModule.classAdapterModule;

public class Adapter extends OldModule implements TargetModule {

    @Override
    public void methodB() {
        System.out.println("TargetModule methodB");
    }
}
