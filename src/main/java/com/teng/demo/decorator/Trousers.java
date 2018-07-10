package com.teng.demo.decorator;

/**
 * 装饰模式：具体服饰类
 */
public class Trousers extends Finery{
    @Override
    public void show() {
        System.out.println("穿上一条长裤");
        super.show();//注：此处调用的实际是传入对象的show()方法
    }
}
