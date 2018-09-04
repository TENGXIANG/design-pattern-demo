package com.teng.demo.visitor;

/**
 * @author TengXiang
 * @date 2018/9/4
 * 访问者模式：客户端
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();

        Man man = new Man();
        man.setName("男人");
        o.attach(man);

        Woman woman = new Woman();
        woman.setName("女人");
        o.attach(woman);

        //成功
        Success v1  = new Success();
        v1.setStatus("成功");
        o.display(v1);

        //失败
        Failing v2 = new Failing();
        v2.setStatus("失败");
        o.display(v2);

        //恋爱
        Amativeness v3 = new Amativeness();
        v3.setStatus("恋爱");
        o.display(v3);

    }
}
