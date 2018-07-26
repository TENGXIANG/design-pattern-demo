package com.teng.demo.iterator;

/**
 * @author TengXiang
 * @date 2018/7/26
 * 迭代器模式：迭代器抽象类
 */
public interface Iterator<Item> {

    Item next();

    boolean hasNext();
}
