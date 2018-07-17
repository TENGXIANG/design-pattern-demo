package com.teng.demo.adapter;

/**
 * 适配器模式：中锋
 */
public class Center extends Player {

    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("中锋： " + this.getName() + " 进攻。");
    }

    @Override
    public void defense() {
        System.out.println("中锋： " +this.getName() + "防守。");
    }
}
