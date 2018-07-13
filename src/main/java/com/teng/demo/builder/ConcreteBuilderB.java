package com.teng.demo.builder;

/**
 * 具体建造者类
 */
public class ConcreteBuilderB extends Builder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.addParts("BB11部件");
    }

    @Override
    public void buildPartB() {
        product.addParts("BB22部件");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
