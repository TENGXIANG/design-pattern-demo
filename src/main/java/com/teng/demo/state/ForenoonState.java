package com.teng.demo.state;

public class ForenoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if(work.getHour() < 12){
            System.out.println("当前时间：" + work.getHour() + " 上午工作，精神百倍。" );
        }else{
            work.setCurrent(new NoonState());
            work.writeProgram();
        }
    }
}
