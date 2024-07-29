package com.cutanddry.qa.functions;

import com.cutanddry.qa.pages.CustomersPage;

public class Customer {
    static CustomersPage customersPage = new CustomersPage();

    public static void searchCustomerByCode(String code){
        customersPage.clickOnSearchCustomers();
        customersPage.typeOnSearchCustomers(code);
    }
    public static boolean isCustomerSearchResultByCodeDisplayed(String code){
        return customersPage.isCustomerSearchResultByCodeDisplayed(code);
    }
    public static void clickOnOrderGuide(String code){
        customersPage.clickOnOrderGuide(code);
    }
    public static void increaseFirstRowQtyByOne(){
        customersPage.clickPlusQryFirstRow();
    }
    public static void decreaseFirstRowQtyByOne(){
        customersPage.clickMinusQryFirstRow();
    }
    public static void increaseFirstRowQtyByThree(){
        customersPage.clickPlusQryFirstRow();
        customersPage.clickPlusQryFirstRow();
        customersPage.clickPlusQryFirstRow();
    }
    public static void decreaseFirstRowQtyByThree(){
        customersPage.clickMinusQryFirstRow();
        customersPage.clickMinusQryFirstRow();
        customersPage.clickMinusQryFirstRow();
    }
    public static void increaseSecondRowQtyByOne(){
        customersPage.clickPlusQrySecondRow();
    }
    public static void decreaseSecondRowQtyByOne(){
        customersPage.clickMinusQrySecondRow();
    }
    public static String getItemNameFirstRow(){
        return customersPage.getItemNameFirstRow();
    }
    public static String getItemNameSecondRow(){
        return customersPage.getItemNameSecondRow();
    }
    public static void checkoutItems(){
        customersPage.clickOnCheckoutButton();
    }
    public static void goToCatalog(){
        customersPage.clickOnCatalogButton();
    }
    public static void searchItemOnCatalog(String item){
        customersPage.typeToSearchOnCatalog(item);
    }
    public static String getFirstElementFrmSearchResults(){
       return customersPage.getFirstItemNameFrmSearchResults();
    }
    public static void addItemToCartCatalog(){
        customersPage.clickAddToCartCatalog();
    }
    public static String getItemQtyFirstRow(){
        return customersPage.getItemQtyFirstRow();
    }
    public static double getItemPriceFirstRow(){
        return customersPage.getItemPriceFirstRow();
    }
    public static double getItemPriceOnCheckoutButton(){
        return customersPage.getItemPriceOnCheckoutButton();
    }

}
