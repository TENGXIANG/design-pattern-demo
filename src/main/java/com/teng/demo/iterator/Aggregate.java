package com.teng.demo.iterator;

/**
 * @author TengXiang
 * @date 2018/7/26
 * 迭代器模式：聚集抽象类
 */
public interface Aggregate {
    Iterator createIterator();
}
