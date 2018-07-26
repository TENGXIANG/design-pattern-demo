package com.teng.demo.iterator;

/**
 * @author TengXiang
 * @date 2018/7/26
 * 迭代器模式：具体迭代器类
 */
public class ConcreteIterator<Item> implements Iterator {

    private Item[] items;
    private Integer count = 0;

    public ConcreteIterator(Item[] items) {
        this.items = items;
    }

    @Override
    public Object next() {
        return this.items[count++];
    }

    @Override
    public boolean hasNext() {
        return count < this.items.length;
    }
}
