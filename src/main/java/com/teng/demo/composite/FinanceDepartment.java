package com.teng.demo.composite;

/**
 * @author TengXiang
 * @date 2018/7/25
 * 组合模式：财务部，树叶节点
 */
public class FinanceDepartment extends Company {

    public FinanceDepartment(String name) {
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
        System.out.println(this.name + " 公司财务收支管理。");
    }
}
