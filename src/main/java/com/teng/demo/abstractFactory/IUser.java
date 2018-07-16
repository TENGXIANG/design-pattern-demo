package com.teng.demo.abstractFactory;

/**
 * 抽象工厂模式：抽象产品类
 */
public interface IUser {

    void insert(User user);

    User getUser(Long id);

}
