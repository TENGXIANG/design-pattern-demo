package com.teng.demo.Proxy;

/**
 * 代理模式
 */
public class Client {
    public static void main(String[] args) {
        SchoolGirl sg = new SchoolGirl();
        sg.setName("小微");

        Proxy proxy = new Proxy(sg);
        proxy.giveFlower();
        proxy.giveChocolate();
        proxy.giveHelloKitty();
    }
}
