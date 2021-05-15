package com.lihenglz.designModule.createModule.singletonModule;

public class Main {

    public static void main(String[] args) {
        SingletonLazy.getInstance().process();//懒汉加载
        SingletonHungry.getInstance().process();//饿汉加载
    }
}
