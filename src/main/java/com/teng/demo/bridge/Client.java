package com.teng.demo.bridge;

/**
 * @author TengXiang
 * @date 2018/7/31
 * 桥接模式：Client
 */
public class Client {
    public static void main(String[] args) {

        TelephoneBrand m = new TelephoneBrandM();
        //TelephoneBrand m = new TelephoneBrandN();
        m.setTelephoneSoft(new TelephoneGame());
        m.run();

        m.setTelephoneSoft(new TelephoneAddressList());
        m.run();

        m.setTelephoneSoft(new TelephoneMP3());
        m.run();
    }
}
