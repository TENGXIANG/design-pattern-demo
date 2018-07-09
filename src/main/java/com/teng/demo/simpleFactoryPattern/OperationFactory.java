package com.teng.demo.simpleFactoryPattern;

public class OperationFactory {

    public static Operation createOperate(String operate){
        Operation operation = null;
        switch (operate){
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new SubOperation();
                break;
            case "*":
                operation = new SubOperation();
                break;
            case "/":
                operation =  new SubOperation();
                break;
        }
        return operation;
    }
}
