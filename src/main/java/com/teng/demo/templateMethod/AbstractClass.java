package com.teng.demo.templateMethod;

/**
 * 模板方法模式
 */
public abstract class AbstractClass {

    public abstract void action1();
    public abstract void action2();

    public void templateMethod(){
        action1();
        action2();
        System.out.println("完成");
    }
}
