package com.lihenglz.designModule.createModule.simpleFactoryModule;

/**
 * 简单支付工程方法
 */
public class SimpleFactory {

    /**
     * 根据参数返回对应的支付对象
     * @param payType
     * @return
     */
    public static Pay createPay(String payType){
        if(payType == null){
            return null;
        } else if(payType.equalsIgnoreCase("WECHAT_PAY")){
            return new WechatPay();
        } else if(payType.equalsIgnoreCase("ALI_PAY")){
            return new AliPay();
        }
        return null;
    }
}
