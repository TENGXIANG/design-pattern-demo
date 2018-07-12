package com.teng.demo.Prototype;

public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private WorkExperience work;

    public Resume(String name){
        this.name = name;
        this.work = new WorkExperience();
    }

    //字段为引用类型，需要clone
    private Resume(WorkExperience work){
       this.work = (WorkExperience)work.clone();
    }

    //设置个人信息
    public void setPersonInfo(String sex, String age){
        this.sex = sex;
        this.age = age;
    }

    //设置公司信息
    public void setWorkExperience(String workDate, String company){
        work.setWorkDate(workDate);
        work.setCompany(company);
    }

    public void display(){
        System.out.printf("姓名:%s,性别:%s,年龄:%s %n",this.name,this.sex,this.age);
        System.out.printf("工作日期:%s,公司:%s %n",this.work.getWorkDate(),this.work.getCompany());
    }

    //克隆时，新new一个对象
    protected Resume clone(){
        Resume obj = new Resume(this.work);
        obj.name = this.name;
        obj.age = this.age;
        obj.sex = this.sex;
        return obj;
    }
}
