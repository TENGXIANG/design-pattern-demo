package com.teng.demo.Proxy;

public class Pursuit implements IGiveGift {

    private SchoolGirl mm;

    public Pursuit(SchoolGirl mm){
        this.mm = mm;
    }

    @Override
    public void giveFlower() {
        System.out.println(this.mm.getName() +" 给你鲜花。");
    }

    @Override
    public void giveChocolate() {
        System.out.println(this.mm.getName() +" 给你巧克力。");
    }

    @Override
    public void giveHelloKitty() {
        System.out.println(this.mm.getName() +" 给你HelloKitty。");
    }
}
