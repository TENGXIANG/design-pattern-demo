package com.teng.demo.interpreter;

/**
 * @author TengXiang
 * @date 2018/8/29
 * 音符类
 */
public class Note extends Expression {
    @Override
    public void excute(String key, double value) {
        String note = "";
        switch(key){
            case "A":
                note = "1";
                break;
            case "B":
                note = "2";
                break;
            case "C":
                note = "3";
                break;
        }
        System.out.println(note);
    }
}
