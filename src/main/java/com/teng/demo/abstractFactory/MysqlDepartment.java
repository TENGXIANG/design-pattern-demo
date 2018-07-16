package com.teng.demo.abstractFactory;

public class MysqlDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("向mysql数据库中插入一条department记录");
    }

    @Override
    public Department getDepartment(Long id) {
        System.out.println("从mysql数据库中获取一条department记录");
        return null;
    }
}
