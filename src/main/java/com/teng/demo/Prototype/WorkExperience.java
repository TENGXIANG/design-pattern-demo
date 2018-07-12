package com.teng.demo.Prototype;

public class WorkExperience implements Cloneable {
    private String workDate;
    private String company;
    private Attachment attachment;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    @Override
    protected WorkExperience clone(){
        Object obj = null;
        try{
            obj = super.clone();
            return (WorkExperience)obj;
        }catch (CloneNotSupportedException e){
            System.out.println("不支持复制！");
            return null;
        }
    }

    @Override
    public String toString() {
        return "WorkExperience{" +
                "workDate='" + workDate + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
