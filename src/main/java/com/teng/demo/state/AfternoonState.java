package com.teng.demo.state;

public class AfternoonState extends State{
    @Override
    public void writeProgram(Work work) {
        if(work.getHour() < 17){
            System.out.println("当前时间： " + work.getHour() + " 下午状态不错，继续努力。");
        }else{
            work.setCurrent(new EveningState());
            work.writeProgram();
        }
    }
}
