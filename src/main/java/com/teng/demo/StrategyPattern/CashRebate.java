package com.teng.demo.StrategyPattern;

/**
 * 策略模式：打折收费
 */
public class CashRebate extends CashSuper {

    private double moneyRebate = 1d;

    public CashRebate(String moneyRebate){
        this.moneyRebate = Double.valueOf(moneyRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money*this.moneyRebate;
    }
}
