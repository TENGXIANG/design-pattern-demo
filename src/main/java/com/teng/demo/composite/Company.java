package com.teng.demo.composite;

/**
 * @author TengXiang
 * @date 2018/7/25
 * 组合模式：公司抽象类
 */
public abstract class Company {

    protected String name;

    public Company(String name){
        this.name = name;
    }

    public abstract void add(Company c);//增加
    public abstract void remove(Company c);//移除
    public abstract void display(int depth);//显示
    public abstract void lineOfDuty();//履行职责

}
