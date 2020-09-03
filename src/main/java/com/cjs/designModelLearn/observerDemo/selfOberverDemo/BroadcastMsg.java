package com.cjs.designModelLearn.observerDemo.selfOberverDemo;

import java.util.ArrayList;
import java.util.List;

public class BroadcastMsg {
    private double one;
    private double two;
    private double three;
    private final List<observerSelfInterface> lists;

    public BroadcastMsg() {
        this.lists = new ArrayList<>();
    }

    public void setNumber(double one, double two, double three){
        this.one = one;
        this.two = two;
        this.three = three;
        notifyAllList();
    }

    private void notifyAllList(){
        System.out.printf("set %s,%s,%s%n",one,two,three);
        if(!lists.isEmpty()){
            lists.forEach(observerSelfInterface::update);
        }
    }

    public void setList(observerSelfInterface obj){
        this.lists.add(obj);
    }

    public double getOne() {
        return one;
    }

    public double getTwo() {
        return two;
    }

    public double getThree() {
        return three;
    }
}
