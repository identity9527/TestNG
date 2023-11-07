package org.example.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    @Test
    @Parameters({"id", "password"})
    public void login(String id, String password){
        if (id.isEmpty() || password.isEmpty())
            System.out.println("error");
        else
            System.out.println("success");
    }

    @Test(dataProvider = "register_provider")
    public void register(String id, String password){
        if (id.isEmpty() || password.isEmpty())
            System.out.println("error");
        else
            System.out.println("id=" + id + "\t" + "password=" + password);
    }

    @DataProvider(name = "register_provider")
    public Object[][] providerData(){
        return new Object[][]{
                {"111","111"},{"222","222"},{"333","333"}
        };
    }
}
