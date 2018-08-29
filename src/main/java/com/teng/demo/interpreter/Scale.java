package com.teng.demo.interpreter;

/**
 * @author TengXiang
 * @date 2018/8/29
 * 音阶类
 */
public class Scale extends Expression {
    @Override
    public void excute(String key, double value) {
        String scale = "";
        switch(Long.toString(Math.round(value))){
            case "1":
                scale = "低音";
                break;
            case "2":
                scale = "中音";
                break;
            case "3":
                scale = "高音";
                break;
        }
        System.out.println(scale);
    }
}
