package com.lihenglz.designModule.createModule.abstractFactory;

import com.lihenglz.designModule.createModule.abstractFactory.ali.AliOrderFactory;
import com.lihenglz.designModule.createModule.abstractFactory.wechat.WechatOrderFactory;

/**
 *
 * 超级工厂创造器，简单工厂模式
 */
public class FactoryProducer {

    public static OrderFactory getFactory(String type){
        if(type.equalsIgnoreCase("WECHAT")){
            return new WechatOrderFactory();
        }else if(type.equalsIgnoreCase("ALI")){
            return new AliOrderFactory();
        }
        return null;
    }
}
