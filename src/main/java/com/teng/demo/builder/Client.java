package com.teng.demo.builder;

/**
 * 建造者模式
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        Builder b1 = new ConcreteBuilderA();
        Builder b2 = new ConcreteBuilderB();

        director.construct(b1);
        Product p1 = b1.getProduct();
        p1.show();

        director.construct(b2);
        Product p2 = b2.getProduct();
        p2.show();
    }
}
