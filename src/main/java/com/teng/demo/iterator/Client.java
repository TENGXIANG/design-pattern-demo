package com.teng.demo.iterator;

/**
 * @author TengXiang
 * @date 2018/7/26
 * 迭代器模式：客户端
 */
public class Client {
    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        Iterator<Integer> iterator = concreteAggregate.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
