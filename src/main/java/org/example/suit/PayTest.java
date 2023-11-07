package org.example.suit;

import org.testng.annotations.*;

public class PayTest {

    @Test(groups = "pay")
    public void test(){
        System.out.println("testPay");
    }

    @Test(groups = "pay")
    public void test1(){
        System.out.println("testPay1");
    }

    @BeforeTest(groups = "pay")
    public void beforeTest(){
        System.out.println("beforeTestPay");
    }

    @AfterTest(groups = "pay")
    public void afterTest(){
        System.out.println("afterTestPay");
    }

    @BeforeMethod(groups = "pay")
    public void beforeMethod(){
        System.out.println("beforeMethodPay");
    }

    @AfterMethod(groups = "pay")
    public void afterMethod(){
        System.out.println("afterMethodPay");
    }

    @BeforeSuite(groups = "pay")
    public void beforeSuite(){
        System.out.println("beforeSuitePay");
    }

    @AfterSuite(groups = "pay")
    public void afterSuite(){
        System.out.println("afterSuitePay");
    }

    @BeforeClass(groups = "pay")
    public void beforeClass(){
        System.out.println("beforeClassPay");
    }

    @AfterClass(groups = "pay")
    public void afterClass(){
        System.out.println("afterClassPay");
    }

    @BeforeGroups("pay")
    public void beforeClientGroup(){
        System.out.println("beforeClientGroup");
    }

    @AfterGroups("pay")
    public void afterSClientGroup(){
        System.out.println("afterClientGroup");
    }

}
