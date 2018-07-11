package com.teng.demo.FactoryMethodPattern;

/**
 * 大学生“工厂”
 */
public class UndergraduateFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}
