package com.cjs.designModelLearn.singleModel.singlrClassic;

public class CoclateBoiler {
    private boolean empty;
    private boolean boiled;
    private static CoclateBoiler coclateBoiler;

    private CoclateBoiler() {
        this.empty = true;
        this.boiled = false;
    }

    public static CoclateBoiler getInstance() {
        if (coclateBoiler == null) {
            coclateBoiler = new CoclateBoiler();
        }
        return coclateBoiler;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

}
