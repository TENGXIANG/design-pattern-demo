package com.teng.demo.command;

/**
 * @author TengXiang
 * @date 2018/8/2
 * 命令模式：抽象命令类
 */
public abstract class Command {

    protected Barbecuer barbecuer;

    public Command(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    //执行命令
    abstract public void ExecuteCommand();
}
