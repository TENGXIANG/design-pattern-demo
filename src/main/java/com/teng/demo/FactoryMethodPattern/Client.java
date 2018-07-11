package com.teng.demo.FactoryMethodPattern;

/**
 * 工厂方法模式
 */
public class Client {
    public static void main(String[] args) {
        IFactory factory1 = new UndergraduateFactory();
        LeiFeng user1 = factory1.createLeiFeng();
        user1.sweep();
        user1.wash();
        user1.buyRice();

        IFactory factory2 = new VolunteerFactory();
        LeiFeng user2 = factory2.createLeiFeng();
        user2.sweep();
        user2.wash();
        user2.buyRice();
    }
}
