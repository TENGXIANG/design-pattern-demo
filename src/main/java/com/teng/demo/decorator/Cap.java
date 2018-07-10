package com.teng.demo.decorator;

/**
 * 装饰模式：具体服饰类
 */
public class Cap extends Finery {

    @Override
    public void show() {
        System.out.println("带上一顶帽子！");
        super.show();//注：此处调用的实际是传入对象的show()方法
    }
}
