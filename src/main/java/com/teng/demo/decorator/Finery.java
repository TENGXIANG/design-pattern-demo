package com.teng.demo.decorator;

/**
 * 装饰模式：服饰类
 */
public class Finery extends Person {

    protected Person component;

    public void setComponent(Person component){
        this.component = component;
    }

    @Override
    public void show() {
        if(this.component != null){
            this.component.show();
        }
    }
}
