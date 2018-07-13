package com.teng.demo.facade;

/**
 * 门面模式/外观模式
 */
public class Fund {

    private Stock1 stock1;
    private Stock2 stock2;
    private Stock3 stock3;

    public Fund(){
        stock1 = new Stock1();
        stock2 = new Stock2();
        stock3 = new Stock3();
    }

    public void buyFund(){
        stock1.buyStock();
        stock2.buyStock();
        stock3.buyStock();
    }

    public void saleFund(){
        stock1.saleStock();
        stock2.saleStock();
        stock3.saleStock();
    }

}
