package org.example.groups;

import org.testng.annotations.Test;

@Test(groups = "tea")
public class GroupOnClassThird {

    public void stu1(){
        System.out.println("GroupOnClassThird:stu1");
    }

    public void stu2(){
        System.out.println("GroupOnClassThird:stu2");
    }

}
