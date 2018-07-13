package com.teng.demo.builder;

/**
 * 抽象建造者类
 */
public abstract class Builder {

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract Product getProduct();
}
