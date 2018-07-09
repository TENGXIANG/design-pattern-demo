package com.teng.demo.simpleFactoryPattern;

import java.math.BigDecimal;

/**
 * 继承，除法操作类的实现
 */
public class DivOperation extends Operation {
    public BigDecimal getResult() {
        if(this.getNumberTwo().equals(new BigDecimal(0.0d))){
            try {
                throw new Exception("除数不能为0");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return this.getNumberOne().divide(this.getNumberTwo());
    }
}
