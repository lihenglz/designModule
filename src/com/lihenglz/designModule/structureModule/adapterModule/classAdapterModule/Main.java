package com.lihenglz.designModule.structureModule.adapterModule.classAdapterModule;

public class Main {

    public static void main(String[] args) {
        TargetModule targetModule = new Adapter();
        targetModule.methodA();
        targetModule.methodB();
    }
}
