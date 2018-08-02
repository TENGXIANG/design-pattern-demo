package com.teng.demo.command;

/**
 * @author TengXiang
 * @date 2018/8/2
 * 命令模式：具体命令类
 */
public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void ExecuteCommand() {
        barbecuer.bakeMutton();
    }

    @Override
    public String toString() {
        return "BakeMuttonCommand";
    }
}
