package com.teng.demo.state;

public class EveningState extends State {
    @Override
    public void writeProgram(Work work) {
        if(work.isFinish()){
            work.setCurrent(new RestState());
            work.writeProgram();
        }else{
            if(work.getHour() < 21){
                System.out.println("当前时间 ： " + work.getHour() + " 加班哦。");
            }else{
                work.setCurrent(new SleepingState());
                work.writeProgram();
            }
        }
    }
}
