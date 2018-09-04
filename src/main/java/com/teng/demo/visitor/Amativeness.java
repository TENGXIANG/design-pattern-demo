package com.teng.demo.visitor;

/**
 * @author TengXiang
 * @date 2018/9/4
 * 访问者模式：恋爱
 */
public class Amativeness extends Action{

    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getName() + this.getStatus() + " == 男人恋爱");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getName() + this.getStatus() + " == 女人恋爱");
    }
}
