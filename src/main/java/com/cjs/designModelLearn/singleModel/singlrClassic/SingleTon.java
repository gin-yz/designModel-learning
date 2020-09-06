package com.cjs.designModelLearn.singleModel.singlrClassic;

public class SingleTon {
    private static volatile SingleTon singleTon;

    private SingleTon() {
    }

    public static SingleTon getInstance() {
        synchronized (SingleTon.class) {
            if (singleTon == null) {
                singleTon = new SingleTon();
            }
        }
        return singleTon;
    }

}
