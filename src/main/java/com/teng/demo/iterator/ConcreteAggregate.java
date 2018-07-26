package com.teng.demo.iterator;

/**
 * @author TengXiang
 * @date 2018/7/26
 * 迭代器模式：具体聚集类
 */
public class ConcreteAggregate implements Aggregate {

    private Integer[] items;

    public ConcreteAggregate() {
        items = new Integer[10];
        for(int i = 0; i < 10 ; i++){
            items[i] = i;
        }
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator<Integer>(items);
    }
}
