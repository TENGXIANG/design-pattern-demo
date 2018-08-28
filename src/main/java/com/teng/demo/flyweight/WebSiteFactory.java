package com.teng.demo.flyweight;

import java.util.Hashtable;

/**
 * @author TengXiang
 * @date 2018/8/28
 * 网站工厂类
 */
public class WebSiteFactory {

    private Hashtable flyweights = new Hashtable();

    //获得网站分类
    public WebSite getWebSiteCategory(String key){
        if(!flyweights.containsKey(key))
            flyweights.put(key,new ConcreteWebSite(key));
        return (WebSite)flyweights.get(key);
    }

    //获得网站分类总数
    public int getWebSiteCount(){
        return flyweights.size();
    }
}
