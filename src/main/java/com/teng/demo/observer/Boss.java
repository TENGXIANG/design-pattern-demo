package com.teng.demo.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式：通知者具体类
 */
public class Boss implements Subject {

    //同事列表
    private List<Observer> list = new ArrayList<>();

    //状态
    private String state;

    @Override
    public void add(Observer observer) {
        list.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyInfo() {
        for(Observer observer : list){
            observer.update();
        }
    }

    @Override
    public String subjectGetState() {
        return state;
    }

    @Override
    public void subjectSetState(String state) {
        this.state = state;
    }
}
