package com.teng.demo.state;

public class NoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if(work.getHour() < 13){
            System.out.println("当前时间：" + work.getHour() + " 吃午饭，午休。");
        }else{
            work.setCurrent(new AfternoonState());
            work.writeProgram();
        }
    }
}
