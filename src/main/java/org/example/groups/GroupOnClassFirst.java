package org.example.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupOnClassFirst {

    public void stu1(){
        System.out.println("GroupOnClassFirst:stu1");
    }

    public void stu2(){
        System.out.println("GroupOnClassFirst:stu2");
    }
}
