package com.teng.demo.composite;

/**
 * @author TengXiang
 * @date 2018/7/25
 * 组合模式：人力资源部，树叶节点
 */
public class HRDepartment extends Company {

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void display(int depth) {
        for(int i = 0 ; i < depth ; i++){
            System.out.print("=");
        }
        System.out.println(this.name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(this.name + " 员工招聘,培训管理。");
    }
}
