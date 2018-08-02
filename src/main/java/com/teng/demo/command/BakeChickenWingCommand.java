package com.teng.demo.command;

/**
 * @author TengXiang
 * @date 2018/8/2
 * 命令模式：具体命令类
 */
public class BakeChickenWingCommand extends Command {

    public BakeChickenWingCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void ExecuteCommand() {
        barbecuer.bakeChickenWing();
    }

    @Override
    public String toString() {
        return "BakeChickenWingCommand";
    }
}
