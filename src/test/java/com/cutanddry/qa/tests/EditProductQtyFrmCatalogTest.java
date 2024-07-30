package com.cutanddry.qa.tests;

import com.cutanddry.qa.base.TestBase;
import com.cutanddry.qa.data.models.User;
import com.cutanddry.qa.functions.Customer;
import com.cutanddry.qa.functions.Dashboard;
import com.cutanddry.qa.functions.Login;
import com.cutanddry.qa.utils.JsonUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EditProductQtyFrmCatalogTest extends TestBase {
    static User user;
    static String customerId = "16579";
    static String itemName = "Artichoke";

    @BeforeMethod
    public void setUp(){
        initialization();
        user = JsonUtil.readUserLogin();
    }

    @Test
    public static void editProductQtyFrmCatalog() {
        SoftAssert softAssert = new SoftAssert();
        Login.loginAsDistributor(user.getEmailOrMobile(), user.getPassword());
        Dashboard.isUserNavigatedToDashboard();
        softAssert.assertTrue(Dashboard.isUserNavigatedToDashboard(),"login error");
        Dashboard.navigateToCustomers();
        Customer.searchCustomerByCode(customerId);
        softAssert.assertTrue(Customer.isCustomerSearchResultByCodeDisplayed(customerId),"search error");
        Customer.clickOnOrderGuide(customerId);
        Customer.goToCatalog();
        Customer.searchItemOnCatalog(itemName);
        softAssert.assertTrue(Customer.getFirstElementFrmSearchResults().contains(itemName), "item not found");
        Customer.addItemToCartCatalog();
        Customer.increaseQtyUpToThreeCatalogSearch();
        softAssert.assertEquals(Customer.getItemPriceOnCheckoutButton(),Customer.getItemPriceCatalogSearch()*3, "price error-after increase");
        Customer.decreaseQtyByThreeCatalogSearch();
        softAssert.assertEquals(Customer.getItemPriceOnCheckoutButton(),0.0, "price error-after decrease");
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown(){
        closeAllBrowsers();
    }

}