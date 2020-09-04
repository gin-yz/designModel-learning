package com.cjs.DemoTest;

import com.cjs.designModelLearn.decoratorModel.selfIoDemo.LowCaseInputStream;

import java.io.InputStream;

public class Demo1 {
    public static void main(String[] args) {
        InputStream inputStream = LowCaseInputStream.class.getResourceAsStream("test_txt.txt");
    }
}
