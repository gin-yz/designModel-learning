package com.cjs.designModelLearn.decoratorModel;

import com.cjs.designModelLearn.decoratorModel.selfIoDemo.LowCaseInputStream;

import java.io.IOException;
import java.io.InputStream;

public class selfIoTest {
    public static void main(String[] args) throws IOException {
        InputStream io = LowCaseInputStream.class.getResourceAsStream("test_txt.txt");
        LowCaseInputStream lowCaseInputStream = new LowCaseInputStream(io);
        int c = 0;
        while ((c=lowCaseInputStream.read())!=-1){
            System.out.print((char)c);
        }

        lowCaseInputStream.close();
    }
}
