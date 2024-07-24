package com.cutanddry.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static com.cutanddry.qa.common.Constants.*;

public class TestBase {
    public static WebDriver driver;

    public TestBase(){

    }

    public static void initialization(){
        if (BROWSER_NAME.equalsIgnoreCase("chrome")){
            ChromeOptions chromeOptions = new ChromeOptions();
//            chromeOptions.addArguments("--start-maximized");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.get(MAIN_URL);
        }
    }

    public static void closeAllBrowsers(){
        driver.quit();
    }

}
