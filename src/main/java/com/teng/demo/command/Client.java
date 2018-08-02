package com.teng.demo.command;

/**
 * @author TengXiang
 * @date 2018/8/2
 * 命令模式：Client
 */
public class Client {
    public static void main(String[] args) {
        //开店前的准备
        Barbecuer boy = new Barbecuer();
        Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
        Command bakeChickenWingCommand1 = new BakeChickenWingCommand(boy);
        Waiter girl = new Waiter();

        //开门营业 顾客点菜
        girl.setOrder(bakeMuttonCommand1);
        girl.setOrder(bakeMuttonCommand2);
        girl.setOrder(bakeChickenWingCommand1);

        //点菜完毕，通知厨房
        girl.notifyAllExecution();
    }
}
