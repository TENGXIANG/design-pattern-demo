package com.teng.demo.Prototype;

/**
 * 原型模式：深复制
 */
public class Client {
    public static void main(String[] args) {
        Resume resume = new Resume("小名");
        resume.setPersonInfo("男","26");
        resume.setWorkExperience("2016-01-03","ZZ公司");
        resume.display();
        System.out.println("=========================");
        Resume newResume = resume.clone();
        newResume.setWorkExperience("2017-02-04","CC公司");
        newResume.setPersonInfo("女","27");
        newResume.display();
        System.out.println("=========================");

        WorkExperience work1 = new WorkExperience();
        WorkExperience work2 = work1.clone();
        System.out.println(work1 == work2);
        //浅复制
        System.out.println(work1.getAttachment() == work2.getAttachment());

    }
}
