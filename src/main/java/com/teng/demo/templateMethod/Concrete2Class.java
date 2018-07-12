package com.teng.demo.templateMethod;

/**
 * 模板方法模式
 */
public class Concrete2Class extends AbstractClass {
    @Override
    public void action1() {
        System.out.println("Concrete2Class 执行 action1");
    }

    @Override
    public void action2() {
        System.out.println("Concrete2Class 执行 action2");
    }
}
