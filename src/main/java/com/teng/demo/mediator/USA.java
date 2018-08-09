package com.teng.demo.mediator;

/**
 * @author TengXiang
 * @date 2018/8/9
 * 中介者模式：美国类
 */
public class USA extends Country{

    public USA(UnitedNations mediator) {
        super(mediator);
    }

    @Override
    public void declare(String message) {
        mediator.declare(message,this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(" 美国获得对方信息： " + message);
    }

}
