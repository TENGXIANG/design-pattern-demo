package com.teng.demo.interpreter;

/**
 * @author TengXiang
 * @date 2018/8/29
 * 解释器模式：客户端
 */
public class Client {
    public static void main(String[] args) {
        PlayContext playContext = new PlayContext();
        System.out.println("等待解释的乐谱：");
        playContext.setText("F 1.2 A 2.1 C 2.6 D 2.3 E 0.8 B 1.1 C 2.9 E 1.7 A 0.9 ");
        Expression expression = null;
        try{
            while (playContext.getText().length() > 0){
                String str = playContext.getText().substring(0,1);
                switch (str){
                    case "A":
                    case "B":
                    case "C":
                        expression = new Note();
                        break;
                    case "D":
                    case "E":
                    case "F":
                        expression = new Scale();
                        break;
                }
                expression.interpret(playContext);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
