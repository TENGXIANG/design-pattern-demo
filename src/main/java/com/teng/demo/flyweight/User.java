package com.teng.demo.flyweight;

/**
 * @author TengXiang
 * @date 2018/8/28
 * 用户类
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
