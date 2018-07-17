package com.teng.demo.state;

/**
 * 状态模式：工作类
 */
public class Work {

    private State current;
    private Integer hour;
    private boolean finish = false;

    public Work(){
        current = new ForenoonState();
    }

    public State getCurrent() {
        return current;
    }

    public void setCurrent(State current) {
        this.current = current;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public void writeProgram(){
        current.writeProgram(this);
    }

}
