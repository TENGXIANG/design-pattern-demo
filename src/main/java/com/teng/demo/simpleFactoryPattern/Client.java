package com.teng.demo.simpleFactoryPattern;

import java.math.BigDecimal;

/**
 * 简单工厂模式：客户端
 */
public class Client {
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperate("+");
        //注：new BigDecimal(1.34); 会产生精度问题  new BigDecimal("1.34"); 不会产生精度问题，如下也不会产生精度问题
        operation.setNumberOne(new BigDecimal(Double.toString(2.5)));
        operation.setNumberTwo(new BigDecimal(Double.toString(4.1)));
        System.out.println(operation.getResult());
    }
}
