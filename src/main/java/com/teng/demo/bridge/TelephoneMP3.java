package com.teng.demo.bridge;

/**
 * @author TengXiang
 * @date 2018/7/31
 * 桥接模式：手机MP3播放
 */
public class TelephoneMP3 extends TelephoneSoft {
    @Override
    public void run() {
        System.out.println("运行手机MP3播放");
    }
}
