package com.teng.demo.observer;

public abstract class Observer {

    protected String name;
    protected Subject subject;

    public Observer(String name,Subject subject){
        this.name = name;
        this.subject = subject;
    }

    public abstract void update();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
