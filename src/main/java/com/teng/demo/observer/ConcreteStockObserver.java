package com.teng.demo.observer;

/**
 * 观察者模式：具体观察者
 */
public class ConcreteStockObserver extends Observer{

    public ConcreteStockObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(this.subject.subjectGetState() + " " + this.getName() + "关闭股票行情，继续工作。。。");
    }
}
