package com.teng.demo.chainOfResponsibility;

/**
 * @author TengXiang
 * @date 2018/8/7
 * 职责连模式：管理者
 */
public abstract class Manager {

    protected String name;

    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    public void setSuperior(Manager superior){
        this.superior = superior;
    }

    public abstract void requestApplications(Request request);

}
