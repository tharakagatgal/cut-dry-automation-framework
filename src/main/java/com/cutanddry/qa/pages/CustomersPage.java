package com.cutanddry.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CustomersPage extends LoginPage {
    By tbx_searchCustomers = By.xpath("//input[@placeholder='Search Customers']");
    String btnOrderGuide = "//td[text()='CODE']/../td[8]//button";
    By lbl_itemNameList = By.xpath("//td//span/div[@data-tip='View Item Details']");
    By btn_increaseQtyFirstRow = By.xpath("//tr[1]/td[8]/div/div/div/div[3]");
    By btn_decreaseQtyFirstRow = By.xpath("//tr[1]/td[8]/div/div/div/div[1]");
    By btn_increaseQtySecondRow = By.xpath("//tr[2]/td[8]/div/div/div/div[3]");
    By btn_decreaseQtySecondRow = By.xpath("//tr[2]/td[8]/div/div/div/div[1]");
    By btn_checkout = By.xpath("//button[@data-for='cartCheckoutButton']");
    By btn_catalog = By.xpath("//div[text()='Catalog']");
    By tbx_catalogSearch = By.xpath("//input[@placeholder='Search catalog...']");
    By lbl_catalogSearchItemList = By.xpath("//div[contains(text(), 'Artichoke')]");
    By btn_addToCart = By.xpath("//button[text()='Add to Cart']");
    By tbx_itemQuantityFirstRow = By.xpath("//tr[1]//td[8]//input");
    By lbl_itemPriceFirstRow = By.xpath("//tr[1]//td[7]/div");

    public void clickOnSearchCustomers(){
        driver.findElement(tbx_searchCustomers);
    }
    public void typeOnSearchCustomers(String code){
        driver.findElement(tbx_searchCustomers).sendKeys(code);
    }
    public boolean isCustomerSearchResultByCodeDisplayed(String code){
        return driver.findElement(By.xpath(btnOrderGuide.replace("CODE", code))).isDisplayed();
    }
    public void clickOnOrderGuide(String code) {
        driver.findElement(By.xpath(btnOrderGuide.replace("CODE", code))).click();
    }
    public String getItemNameFirstRow(){
        return driver.findElements(lbl_itemNameList).getFirst().getText();
    }
    public void clickPlusQryFirstRow(){
        driver.findElement(btn_increaseQtyFirstRow).click();
    }
    public void clickMinusQryFirstRow(){
        driver.findElement(btn_decreaseQtyFirstRow).click();
    }
    public void clickMinusQrySecondRow(){
        driver.findElement(btn_decreaseQtySecondRow).click();
    }
    public String getItemNameSecondRow(){
        return driver.findElements(lbl_itemNameList).get(1).getText();
    }
    public void clickPlusQrySecondRow(){
        driver.findElement(btn_increaseQtySecondRow).click();
    }
    public void clickOnCheckoutButton(){
        wait.until(ExpectedConditions.elementToBeClickable(btn_checkout));
        driver.findElement(btn_checkout).click();
    }
    public void clickOnCatalogButton(){
        driver.findElement(btn_catalog).click();
    }
    public void typeToSearchOnCatalog(String item){
        driver.findElement(tbx_catalogSearch).sendKeys(item);
    }
    public String getFirstItemNameFrmSearchResults(){
        return driver.findElements(lbl_catalogSearchItemList).getFirst().getText();
    }
    public void clickAddToCartCatalog(){
        driver.findElement(btn_addToCart).click();
    }
    public String getItemQtyFirstRow(){
        return driver.findElement(tbx_itemQuantityFirstRow).getAttribute("value");
    }
    public Double getItemPriceFirstRow(){
        return Double.valueOf(driver.findElement(lbl_itemPriceFirstRow).getText().replace("$",""));
    }
    public Double getItemPriceOnCheckoutButton(){
        return Double.valueOf(driver.findElement(btn_checkout).getText().replace("$",""));
    }
}
