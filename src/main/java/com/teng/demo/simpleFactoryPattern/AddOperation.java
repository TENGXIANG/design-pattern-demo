package com.teng.demo.simpleFactoryPattern;

import java.math.BigDecimal;

/**
 * 继承，加法操作类的实现
 */
public class AddOperation extends Operation {
    public BigDecimal getResult() {
        return this.getNumberOne().add(this.getNumberTwo());
    }
}
