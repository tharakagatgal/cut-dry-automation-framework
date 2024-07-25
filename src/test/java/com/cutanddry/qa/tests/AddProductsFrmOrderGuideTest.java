package com.cutanddry.qa.tests;

import com.cutanddry.qa.base.TestBase;
import com.cutanddry.qa.data.models.User;
import com.cutanddry.qa.functions.Customer;
import com.cutanddry.qa.functions.Dashboard;
import com.cutanddry.qa.functions.Login;
import com.cutanddry.qa.utils.JsonUtil;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class AddProductsFrmOrderGuideTest extends TestBase {
    static User user;
    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        user = JsonUtil.readUserLogin();
    }

    @Test
    public static void loginAsDistributor(){
        String itemName;
        SoftAssert softAssert = new SoftAssert();
        Login.loginAsDistributor(user.getEmailOrMobile(), user.getPassword());
        Dashboard.isUserNavigatedToDashboard();
        softAssert.assertTrue(Dashboard.isUserNavigatedToDashboard(),"login error");
        Dashboard.navigateToCustomers();
        Customer.searchCustomerByCode("16579");
        softAssert.assertTrue(Customer.isCustomerSearchResultByCodeDisplayed("16579"),"search error");
        Customer.clickOnOrderGuide("16579");
        itemName = Customer.getItemNameFirstRow();
        Customer.increaseFirstRowQtyByOne();
        Customer.checkoutItems();
        softAssert.assertEquals(Customer.getItemNameFirstRow(),itemName,"item mismatch");
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown(){
        closeAllBrowsers();
    }

}
