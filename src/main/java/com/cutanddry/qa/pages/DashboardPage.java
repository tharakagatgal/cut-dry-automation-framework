package com.cutanddry.qa.pages;

import org.openqa.selenium.By;

public class DashboardPage extends LoginPage{
    By txt_dashboard = By.xpath("//h3[text()='Dashboard']");

    public boolean isDashboardTextDisplayed(){
        return driver.findElement(txt_dashboard).isDisplayed();
    }
}
