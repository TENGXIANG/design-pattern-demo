package com.teng.demo.adapter;

/**
 * 适配器模式
 */
public class Client {
    public static void main(String[] args) {
        Player p1 = new Forwards("小A");
        p1.attack();
        Player p2 = new Guards("小B");
        p2.attack();

        Player p3 = new Translator("小C");
        p3.attack();
        p3.defense();
    }
}
