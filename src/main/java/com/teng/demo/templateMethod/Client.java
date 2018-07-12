package com.teng.demo.templateMethod;

/**
 * 模板方法模式
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass a1 = new Concrete1Class();
        a1.templateMethod();
        AbstractClass a2 = new Concrete2Class();
        a2.templateMethod();
    }
}
