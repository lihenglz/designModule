package com.lihenglz.designModule.createModule.prototypeModule;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Persion implements Cloneable, Serializable {

    private String name;

    private int age;

    private List<String> list = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    protected Persion clone() throws CloneNotSupportedException {
        return (Persion) super.clone();
    }

    public Object deepClone(){
        try {
            //输出序列化
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);

            //输入 反序列化
            ByteArrayInputStream bios = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bios);
            Persion copyObj = (Persion) ois.readObject();
            return copyObj;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }
}

