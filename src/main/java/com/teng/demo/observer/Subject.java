package com.teng.demo.observer;

/**
 * 观察者模式：通知者接口
 */
public interface Subject {
    void add(Observer observer);
    void delete(Observer observer);
    void notifyInfo();
    String subjectGetState();
    void subjectSetState(String state);
}
