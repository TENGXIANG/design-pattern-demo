package com.teng.demo.visitor;

/**
 * @author TengXiang
 * @date 2018/9/4
 * 访问者模式：人的抽象类
 */
public abstract class Person {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //接收
    public abstract void accept(Action actionVisitor);

}
