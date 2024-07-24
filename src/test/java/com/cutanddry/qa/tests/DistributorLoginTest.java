package com.cutanddry.qa.tests;

import com.cutanddry.qa.base.TestBase;
import com.cutanddry.qa.functions.Login;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DistributorLoginTest extends TestBase {

    @BeforeClass
    public void setUp(){
        initialization();
    }

    @Test
    public static void loginAsDistributor(){
        Login.loginAsDistributor("415-505-5531","NovaN@123");
    }

    @AfterClass
    public void tearDown(){
        closeAllBrowsers();
    }
}
