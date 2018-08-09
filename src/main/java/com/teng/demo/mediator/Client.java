package com.teng.demo.mediator;

/**
 * @author TengXiang
 * @date 2018/8/9
 * 中介者模式：Client
 */
public class Client {

    public static void main(String[] args) {
        UnitedNationsSecurityCouncil unsc = new UnitedNationsSecurityCouncil();
        USA c1 = new USA(unsc);
        Iraq c2 = new Iraq(unsc);

        unsc.setColleague1(c1);
        unsc.setColleague2(c2);

        c1.declare("不准研制核武器");
        c2.declare("我们没有核武器");

    }
}
