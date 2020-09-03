package com.cjs.designModelLearn.ObserverLearnTest;

import com.cjs.designModelLearn.observerDemo.selfOberverDemo.BroadcastMsg;
import com.cjs.designModelLearn.observerDemo.selfOberverDemo.Display;

public class selfObserverTest {
    public static void main(String[] args) {
        BroadcastMsg broadcastMsg = new BroadcastMsg();
        Display display = new Display(broadcastMsg);

        broadcastMsg.setNumber(1,2,3);
    }
}
