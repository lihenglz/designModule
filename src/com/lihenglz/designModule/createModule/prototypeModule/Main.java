package com.lihenglz.designModule.createModule.prototypeModule;

import java.util.List;

/**
 * 原型模式
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Persion persion1 = new Persion();
        persion1.setAge(10);
        persion1.setName("TOM");
        persion1.getList().add("aaa");
        persion1.getList().add("bbb");
        //前拷贝
        //Persion persion2 = persion1.clone();
        //深拷贝
        Persion persion2 = (Persion) persion1.deepClone();
        persion2.setName("ANNA");
        persion2.getList().add("ccc");

        System.out.println("persion1="+persion1.getName()+";age="+persion1.getAge()+";list="+persion1.getList());
        System.out.println("persion2="+persion2.getName()+";age="+persion2.getAge()+";list="+persion2.getList());

    }
}
