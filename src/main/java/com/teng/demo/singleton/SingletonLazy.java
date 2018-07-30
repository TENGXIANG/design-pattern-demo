package com.teng.demo.singleton;

/**
 * @author TengXiang
 * @date 2018/7/30
 * 单例模式:懒汉式
 */
public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy(){
    }

    public static SingletonLazy getInstance(){
        if(instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }

}
