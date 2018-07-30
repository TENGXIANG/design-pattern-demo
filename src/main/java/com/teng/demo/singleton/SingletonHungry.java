package com.teng.demo.singleton;

/**
 * @author TengXiang
 * @date 2018/7/30
 * 单例模式：饿汉式（线程安全）
 */
public class SingletonHungry {

    private static SingletonHungry singletonHungry = new SingletonHungry();

    private SingletonHungry(){
    }

    public static SingletonHungry getInstance(){
        return singletonHungry;
    }

}
