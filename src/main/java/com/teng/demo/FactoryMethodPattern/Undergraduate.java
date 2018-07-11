package com.teng.demo.FactoryMethodPattern;

public class Undergraduate extends LeiFeng{

    @Override
    public void sweep() {
        System.out.println("大学生学雷锋，扫地");
    }

    @Override
    public void wash() {
        System.out.println("大学生学雷锋，洗衣");
    }

    @Override
    public void buyRice() {
        System.out.println("大学生学雷锋，买米");
    }
}
