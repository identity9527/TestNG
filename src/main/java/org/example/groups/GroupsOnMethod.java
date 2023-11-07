package org.example.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @BeforeGroups("server")
    public void beforeServerGroup(){
        System.out.println("beforeServerGroup");
    }

    @AfterGroups("server")
    public void afterServerGroup(){
        System.out.println("afterServerGroup");
    }

    @Test(groups = "server")
    public void server(){
        System.out.println("server0");
    }

    @Test(groups = "server")
    public void server1(){
        System.out.println("server1");
    }
    @Test(groups = "server")
    public void server2(){
        System.out.println("server2");
    }

    @BeforeGroups("client")
    public void beforeClientGroup(){
        System.out.println("beforeClientGroup");
    }

    @AfterGroups("client")
    public void afterSClientGroup(){
        System.out.println("afterClientGroup");
    }

    @Test(groups = "client")
    public void client0(){
        System.out.println("client0");
    }

    @Test(groups = "client")
    public void client1(){
        System.out.println("client1");
    }

    @Test(groups = "client")
    public void client2(){
        System.out.println("client2");
    }
}
