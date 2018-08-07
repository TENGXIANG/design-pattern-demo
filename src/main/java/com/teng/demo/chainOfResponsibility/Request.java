package com.teng.demo.chainOfResponsibility;

/**
 * @author TengXiang
 * @date 2018/8/7
 * 职责链模式：请求实体类
 */
public class Request {

    private String requestType;

    private String requestContent;

    private Integer number;

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
