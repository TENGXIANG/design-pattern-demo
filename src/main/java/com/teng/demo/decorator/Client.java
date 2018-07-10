package com.teng.demo.decorator;

public class Client {
    public static void main(String[] args) {
        Person p = new Person("小明");

        Tshirts tshirts = new Tshirts();
        Trousers trousers = new Trousers();
        Cap cap = new Cap();

        System.out.println("第一种装扮：");
        tshirts.setComponent(p);
        trousers.setComponent(tshirts);
        cap.setComponent(trousers);
        cap.show();

        System.out.println("第二种装扮：");
        cap.setComponent(p);
        tshirts.setComponent(cap);
        trousers.setComponent(tshirts);
        trousers.show();
    }
}
