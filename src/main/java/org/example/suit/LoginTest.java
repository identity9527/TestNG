package org.example.suit;

import org.testng.annotations.*;

public class LoginTest {

    @Test(groups = "login")
    public void login(){
        System.out.println("login");
    }

    @Test(groups = "login")
    public void login1(){
        System.out.println("login1");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTestLogin");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTestLogin");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethodLogin");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethodLogin");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuiteLogin");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuiteLogin");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClassLogin");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClassLogin");
    }


    @BeforeGroups("login")
    public void beforeClientGroup(){
        System.out.println("beforeClientGroup");
    }

    @AfterGroups("login")
    public void afterSClientGroup(){
        System.out.println("afterClientGroup");
    }

}
