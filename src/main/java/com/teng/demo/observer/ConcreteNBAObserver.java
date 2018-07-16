package com.teng.demo.observer;

public class ConcreteNBAObserver  extends Observer{

    public ConcreteNBAObserver(String name,Subject subject) {
        super(name,subject);
    }

    @Override
    public void update() {
        System.out.println(this.subject.subjectGetState() + " " + this.getName() + "关闭NBA，继续工作。。。" );
    }
}
