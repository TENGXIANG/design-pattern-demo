package com.teng.demo.builder;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private List<String> list = new ArrayList<>();

    public void addParts(String part){
        list.add(part);
    }

    public void show(){
        System.out.println("开始 创建----");
        for(String module : list){
            System.out.println(module);
        }
    }
}
