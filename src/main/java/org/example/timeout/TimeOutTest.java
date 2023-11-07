package org.example.timeout;

import org.testng.annotations.Test;

public class TimeOutTest {

    @Test(timeOut = 3000)
    public void testSuccess(){
        try {
            Thread.sleep(3500);
        } catch (InterruptedException ignored) {

        }
    }
}
