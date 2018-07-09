package com.teng.demo.simpleFactoryPattern;

import java.math.BigDecimal;

/**
 * 继承，减法操作类的实现
 */
public class SubOperation extends Operation {
    public BigDecimal getResult() {
        return this.getNumberOne().subtract(this.getNumberTwo());
    }
}
