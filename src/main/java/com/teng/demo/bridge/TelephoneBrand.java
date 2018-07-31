package com.teng.demo.bridge;

/**
 * @author TengXiang
 * @date 2018/7/31
 * 桥接模式：手机品牌抽象类
 */
public abstract class TelephoneBrand {

    protected TelephoneSoft soft;

    public void setTelephoneSoft(TelephoneSoft soft){
        this.soft = soft;
    }

    public abstract void run();
}
