package com.teng.demo.facade;

/**
 * 外观模式
 */
public class Client {
    public static void main(String[] args) {
        Fund fund = new Fund();
        fund.buyFund();
        fund.saleFund();
    }
}
