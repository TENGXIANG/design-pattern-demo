package com.teng.demo.abstractFactory;

public class MysqlUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("向mysql插入一条user记录");
    }

    @Override
    public User getUser(Long id) {
        System.out.println("从mysql获取一条user记录");
        return null;
    }
}
