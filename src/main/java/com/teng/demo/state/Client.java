package com.teng.demo.state;

/**
 * 状态模式
 */
public class Client {
    public static void main(String[] args) {
        Work w = new Work();
        w.setHour(9);
        w.writeProgram();

        w.setHour(11);
        w.writeProgram();

        w.setHour(19);
        w.writeProgram();

        w.setHour(22);
        w.setFinish(true);
        w.writeProgram();
    }
}
