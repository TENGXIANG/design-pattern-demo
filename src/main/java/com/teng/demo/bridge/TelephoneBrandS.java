package com.teng.demo.bridge;

/**
 * @author TengXiang
 * @date 2018/7/31
 * 桥接模式：手机品牌S
 */
public class TelephoneBrandS extends TelephoneBrand {
    @Override
    public void run() {
        System.out.println("=S=");
        soft.run();
    }
}
