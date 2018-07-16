package com.teng.demo.abstractFactory;

/**
 * 抽象工厂模式：抽象产品类
 */
public interface IDepartment {

    void insert(Department department);

    Department getDepartment(Long id);

}
