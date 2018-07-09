package com.teng.demo.simpleFactoryPattern;

import java.math.BigDecimal;

/**
 * 简单工厂模式：抽象，抽象类,操作类
 */
public abstract class Operation {

    private BigDecimal numberOne;
    private BigDecimal numberTwo;

    public BigDecimal getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(BigDecimal numberOne) {
        this.numberOne = numberOne;
    }

    public BigDecimal getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(BigDecimal numberTwo) {
        this.numberTwo = numberTwo;
    }

    public abstract BigDecimal getResult();

}
