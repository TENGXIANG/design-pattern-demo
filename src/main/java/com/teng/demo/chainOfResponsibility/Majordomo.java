package com.teng.demo.chainOfResponsibility;

/**
 * @author TengXiang
 * @date 2018/8/7
 * 职责链模式：总监
 */
public class Majordomo extends Manager{

    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if("请假".equals(request.getRequestType()) && (request.getNumber() <= 5)){
            System.out.println(this.name + " " + request.getRequestContent() + " 数量" + request.getNumber() + " 被批准。" );
        }else{
            if(superior != null){
                superior.requestApplications(request);
            }
        }
    }
}
