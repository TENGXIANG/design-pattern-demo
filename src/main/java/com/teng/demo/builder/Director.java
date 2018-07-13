package com.teng.demo.builder;

/**
 * 指挥者类：传入具体建造类，调用建造方法，并将结果数据，存于具体建造类中
 */
public class Director {
    public void construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }
}
