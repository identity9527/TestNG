package org.example.ignore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class Ignore {

    @BeforeMethod
    public void before(){
        System.out.println("before");
    }

    public void methord(){
        System.out.println("ignoreXx");
    }

    public void igonreMethord(){
        System.out.println("ignore");
    }

}
