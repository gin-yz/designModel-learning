package com.cjs.designModelLearn.observerDemo.selfOberverDemo;


public class Display implements observerSelfInterface{
    BroadcastMsg broadcastMsg = null;

    public Display(BroadcastMsg broadcastMsg) {
        broadcastMsg.setList(this);
        this.broadcastMsg = broadcastMsg;
    }

    @Override
    public void update() {
        System.out.printf("update %s,%s,%s%n", broadcastMsg.getOne(), broadcastMsg.getTwo(), broadcastMsg.getThree());
    }
}
