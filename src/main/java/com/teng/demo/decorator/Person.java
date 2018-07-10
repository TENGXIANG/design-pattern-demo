package com.teng.demo.decorator;

/**
 * 装饰模式：Person类
 */
public class Person {

    public Person(){}

    private String name;

    public Person(String name){
        this.name = name;
    }

    public void show(){
        System.out.println("装扮。。。。。。");
    }
}
