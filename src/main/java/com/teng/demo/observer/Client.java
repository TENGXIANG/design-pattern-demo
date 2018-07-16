package com.teng.demo.observer;

/**
 * 观察者模式
 */
public class Client {
    public static void main(String[] args) {
        Boss boss = new Boss();

        boss.subjectSetState("我胡汉三回来啦。");

        ConcreteNBAObserver concreteNBAObserver = new ConcreteNBAObserver("小张", boss);
        ConcreteStockObserver concreteStockObserver = new ConcreteStockObserver("小王", boss);

        boss.add(concreteNBAObserver);
        boss.add(concreteStockObserver);
        boss.notifyInfo();
    }
}
