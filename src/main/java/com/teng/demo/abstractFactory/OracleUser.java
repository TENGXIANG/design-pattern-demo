package com.teng.demo.abstractFactory;

public class OracleUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("向Oracle中插入一条user记录");
    }

    @Override
    public User getUser(Long id) {
        System.out.println("从Oracle中获取一条user记录");
        return null;
    }
}
