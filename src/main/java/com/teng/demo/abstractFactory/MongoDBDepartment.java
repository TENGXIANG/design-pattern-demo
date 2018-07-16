package com.teng.demo.abstractFactory;

import javax.sound.midi.Soundbank;

public class MongoDBDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("向MongoDB中插入一条department记录");
    }

    @Override
    public Department getDepartment(Long id) {
        System.out.println("从MongoDB中获取一条department记录");
        return null;
    }
}
