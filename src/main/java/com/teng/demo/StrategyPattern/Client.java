package com.teng.demo.StrategyPattern;

public class Client {
    public static void main(String[] args) {
        CashContext cashContext = new CashContext("满300返100");
        double total = cashContext.getResult(686);
        System.out.println(total);
    }
}
