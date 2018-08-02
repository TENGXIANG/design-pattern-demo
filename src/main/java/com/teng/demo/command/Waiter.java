package com.teng.demo.command;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author TengXiang
 * @date 2018/8/2
 * 命令模式：服务员类
 */
public class Waiter {

    private List<Command> orders = new ArrayList<>();

    //设置订单
    public void setOrder(Command command){
        if(command instanceof BakeChickenWingCommand){
            System.out.println("服务员：鸡翅没了，请点些别的烧烤");
        }else{
            orders.add(command);
            System.out.println("增加订单：" + command.toString() + "  时间：" + new Date().toString());
        }
    }

    //取消订单
    public void cancelOrder(Command command){
        orders.remove(command);
        System.out.println("取消订单：" + command.toString() + "  时间：" + new Date().toString());
    }

    //通知全部执行
    public void notifyAllExecution(){
        for(Command command : orders){
            command.ExecuteCommand();
        }
    }
}
