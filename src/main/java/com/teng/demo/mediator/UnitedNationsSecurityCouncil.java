package com.teng.demo.mediator;

/**
 * @author TengXiang
 * @date 2018/8/9
 * 中介者模式：联合国安全理事会
 */
public class UnitedNationsSecurityCouncil extends UnitedNations {

    private USA colleague1;
    private Iraq colleague2;

    //美国
    public void setColleague1(USA colleague1) {
        this.colleague1 = colleague1;
    }

    //伊拉克
    public void setColleague2(Iraq colleague2) {
        this.colleague2 = colleague2;
    }

    //声明
    @Override
    public void declare(String message, Country colleague) {
        if(colleague instanceof USA){
            colleague2.getMessage(message);
        }else{
            colleague1.getMessage(message);
        }
    }
}
