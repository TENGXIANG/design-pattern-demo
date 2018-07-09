package com.teng.demo.StrategyPattern;

/**
 * 策略模式：返利收费
 */
public class CashReturn extends CashSuper {

    private double moneyCondition = 0.0d;
    private double moneyReturn = 0.0d;
    public CashReturn(String moneyCondition,String moneyReturn){
        this.moneyCondition = Double.valueOf(moneyCondition);
        this.moneyReturn = Double.valueOf(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if(money >= this.moneyCondition){
            result = money - this.moneyReturn;
        }
        return result;
    }
}
