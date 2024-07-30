package com.cutanddry.qa.functions;

import com.cutanddry.qa.pages.CustomersPage;
import lombok.SneakyThrows;

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
    public static void increaseQtyByOneCatalogSearchValueOne(){
        customersPage.clickPlusQryCatalogSearchValueOne();
    }
    public static void increaseQtyByOneCatalogSearchValueTwo(){
        customersPage.clickPlusQryCatalogSearchValueOne();
    }
    public static void decreaseQtyByOneCatalogSearchValueOne(){
        customersPage.clickMinusQryCatalogSearchValueOne();
    }
    public static void decreaseQtyByOneCatalogSearchValueTwo(){
        customersPage.clickMinusQryCatalogSearchValueTwo();
    }
    public static void decreaseQtyByOneCatalogSearchValueThree(){
        customersPage.clickMinusQryCatalogSearchValueThree();
    }
    @SneakyThrows
    public static void increaseQtyUpToThreeCatalogSearch(){
        customersPage.clickPlusQryCatalogSearchValueOne();
        customersPage.clickPlusQryCatalogSearchValueTwo();
        Thread.sleep(4000);
    }
    public static void decreaseQtyByThreeCatalogSearch(){
        customersPage.clickMinusQryCatalogSearchValueThree();
        customersPage.clickMinusQryCatalogSearchValueTwo();
        customersPage.clickMinusQryCatalogSearchValueOne();
    }
    public static String getItemQryCatalogSearch(){
        return customersPage.getItemQryCatalogSearch();
    }
    public static Double getItemPriceCatalogSearch(){
        return customersPage.getItemPriceCatalogSearch();
    }
    public static void increaseQtyUpToThreeFirstRowCart(){
        customersPage.clickPlusQryCartRowOne();
        customersPage.clickPlusQryCartRowOne();
    }
    public static void decreaseQtyUpToZeroFirstRowCart(){
        customersPage.clickMinusQryCartRowOne();
        customersPage.clickMinusQryCartRowOne();
        customersPage.clickMinusQryCartRowOne();
    }
    public static double getUnitPriceFirstRowCart(){
        return customersPage.getUnitPriceFirstRowCart();
    }
    public static double getTotalPriceCart(){
        return customersPage.getTotalPriceCart();
    }
    public static void submitOrder(){
        customersPage.submitOrder();
        if (customersPage.isDuplicatePopupDisplayed()){
            customersPage.clickYesDuplicatePopup();
        }
    }
    public static boolean isThankingForOrderPopupDisplayed(){
        return customersPage.isThankingForOrderPopupDisplayed();
    }
}
