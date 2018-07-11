package com.teng.demo.FactoryMethodPattern;

/**
 * 志愿者“工厂”
 */
public class VolunteerFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
