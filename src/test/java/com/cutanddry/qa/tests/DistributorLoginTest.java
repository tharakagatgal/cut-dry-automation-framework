package com.cutanddry.qa.tests;

import com.cutanddry.qa.base.TestBase;
import com.cutanddry.qa.data.models.User;
import com.cutanddry.qa.functions.Login;
import com.cutanddry.qa.utils.JsonUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class DistributorLoginTest extends TestBase {
    static User user;
    @BeforeClass
    public void setUp() throws IOException {
        initialization();
        user = JsonUtil.readUserLogin();
    }

    @Test
    public static void loginAsDistributor(){
        Login.loginAsDistributor(user.getEmailOrMobile(), user.getPassword());
    }

    @AfterClass
    public void tearDown(){
        closeAllBrowsers();
    }
}
