package com.teng.demo.bridge;

/**
 * @author TengXiang
 * @date 2018/7/31
 * 桥接模式：手机品牌M
 */
public class TelephoneBrandM extends TelephoneBrand {
    @Override
    public void run() {
        System.out.println("=M=");
        soft.run();
    }
}
