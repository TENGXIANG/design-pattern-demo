package com.teng.demo.adapter;

/**
 * 适配器模式：后卫
 */
public class Guards extends Player {

    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("后卫: " + this.getName() + " 进攻。");
    }

    @Override
    public void defense() {
        System.out.println("后卫： " + this.getName() + " 防守。");
    }
}
