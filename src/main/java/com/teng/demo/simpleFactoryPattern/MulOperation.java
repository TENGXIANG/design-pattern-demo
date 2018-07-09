package com.teng.demo.simpleFactoryPattern;

import java.math.BigDecimal;

/**
 * 继承，乘法操作类的实现
 */
public class MulOperation extends Operation {
    public BigDecimal getResult() {
        return this.getNumberOne().multiply(this.getNumberTwo());
    }
}
