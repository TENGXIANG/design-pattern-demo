package com.teng.demo.adapter;

/**
 * 适配器模式：共同接口
 */
public abstract class Player {

    private String name;

    public Player(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //进攻
    public abstract void attack();
    //防守
    public abstract void defense();

}
