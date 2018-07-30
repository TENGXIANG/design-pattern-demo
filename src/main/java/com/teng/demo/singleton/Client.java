package com.teng.demo.singleton;

/**
 * @author TengXiang
 * @date 2018/7/30
 * 单例模式：CLient
 */
public class Client {

    public static void main(String[] args) {
        //================懒汉式===========================
        /*SingletonLazy instance1 = SingletonLazy.getInstance();
        SingletonLazy instance2 = SingletonLazy.getInstance();

        if(instance1 == instance2){
            System.out.println("两个对象相同");
        }*/
        //================饿汉式===========================
        SingletonHungry hungry1 = SingletonHungry.getInstance();
        SingletonHungry hungry2 = SingletonHungry.getInstance();

        if(hungry1 == hungry2){
            System.out.println("两个对象相同");
        }
    }
}
