package com.teng.demo.mediator;

/**
 * @author TengXiang
 * @date 2018/8/9
 * 中介者模式：国家抽象类
 */
public abstract class Country {

    protected UnitedNations mediator;

    public Country(UnitedNations mediator){
        this.mediator = mediator;
    }

    //声明
    public abstract void declare(String message);

    //获得消息
    public abstract void getMessage(String message);

}
