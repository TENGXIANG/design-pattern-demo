package com.teng.demo.visitor;

/**
 * @author TengXiang
 * @date 2018/9/4
 * 访问者模式：女人
 */
public class Woman extends Person  {
    @Override
    public void accept(Action actionVisitor) {
        actionVisitor.getWomanConclusion(this);
    }
}
