package com.teng.demo.visitor;

/**
 * @author TengXiang
 * @date 2018/9/4
 * 访问者模式：男人
 */
public class Man extends Person {
    @Override
    public void accept(Action actionVisitor) {
        actionVisitor.getManConclusion(this);
    }
}
