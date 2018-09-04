package com.teng.demo.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TengXiang
 * @date 2018/9/4
 * 访问者模式：对象结构
 */
public class ObjectStructure {

    private List<Person> elements = new ArrayList<>();

    //增加
    public void attach(Person person){
        elements.add(person);
    }
    //移除
    public void detach(Person person){
        elements.remove(person);
    }
    //查看显示
    public void display(Action actionVisitor){
        for(Person person : elements){
            person.accept(actionVisitor);
        }
    }

}
