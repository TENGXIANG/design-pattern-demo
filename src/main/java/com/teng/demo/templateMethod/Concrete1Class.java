package com.teng.demo.templateMethod;

/**
 * 模板方法模式
 */
public class Concrete1Class extends AbstractClass{
    @Override
    public void action1() {
        System.out.println("Concrete1Class 执行 action1");
    }

    @Override
    public void action2() {
        System.out.println("Concrete1Class 执行 action2");
    }
}
