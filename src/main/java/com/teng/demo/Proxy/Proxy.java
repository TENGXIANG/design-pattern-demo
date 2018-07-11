package com.teng.demo.Proxy;

/**
 * 代理模式
 */
public class Proxy implements IGiveGift {
    private Pursuit pursuit;

    public Proxy(SchoolGirl mm){
        pursuit = new Pursuit(mm);
    }

    @Override
    public void giveFlower() {
        pursuit.giveFlower();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }

    @Override
    public void giveHelloKitty() {
        pursuit.giveHelloKitty();
    }
}
