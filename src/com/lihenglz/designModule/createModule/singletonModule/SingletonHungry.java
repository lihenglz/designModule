package com.lihenglz.designModule.createModule.singletonModule;

/**
 * 方法描述：单例模式中饿汉模式
 */
public class SingletonHungry {

    private static SingletonHungry instance = new SingletonHungry();

    private SingletonHungry() {
    }

    public static SingletonHungry getInstance() {
        return instance;
    }

    /**
     * 单例对象的方法
     */
    public void process(){
        System.out.println("单例饿汉方式调用成功");
    }
}
