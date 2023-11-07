package org.example.suit;

import org.testng.annotations.*;

public class SuitConfig {

    @Test(groups = "suit")
    public void test(){
        System.out.println("suit");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTestSuit");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTestSuit");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethodSuit");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethodSuit");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuiteSuit");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuiteSuit");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClassSuit");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClassSuit");
    }

    @BeforeGroups("suit")
    public void beforeClientGroup(){
        System.out.println("beforeClientGroup");
    }

    @AfterGroups("suit")
    public void afterSClientGroup(){
        System.out.println("afterClientGroup");
    }


}
