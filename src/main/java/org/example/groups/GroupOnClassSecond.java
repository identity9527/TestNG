package org.example.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupOnClassSecond {

    public void stu1(){
        System.out.println("GroupOnClassSecond:stu1");
    }

    public void stu2(){
        System.out.println("GroupOnClassSecond:stu2");
    }

}
