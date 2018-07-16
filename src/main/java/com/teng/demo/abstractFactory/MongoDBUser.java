package com.teng.demo.abstractFactory;

public class MongoDBUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("向MongoDB中插入一条user记录");
    }

    @Override
    public User getUser(Long id) {
        System.out.println("从MongoDB中获取一条user记录");
        return null;
    }
}
