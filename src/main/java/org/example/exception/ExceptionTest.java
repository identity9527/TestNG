package org.example.exception;

import org.testng.annotations.Test;

public class ExceptionTest {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionTest(){
        System.out.println("runTimeExceptionTest");
        throw new RuntimeException();
    }

}
