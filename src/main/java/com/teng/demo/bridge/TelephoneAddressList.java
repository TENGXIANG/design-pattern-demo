package com.teng.demo.bridge;

/**
 * @author TengXiang
 * @date 2018/7/31
 * 桥接模式：手机通讯录
 */
public class TelephoneAddressList extends TelephoneSoft {
    @Override
    public void run() {
        System.out.println("运行手机通讯录。");
    }
}
