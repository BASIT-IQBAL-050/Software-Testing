package Subexpert.helper;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utility {
    public static void clickElement(WebDriver driver, By locator) {
        driver.findElement(locator).click();
    }

    public static void sendKeys(WebDriver driver, By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    public static String getElementText(WebDriver driver, By locator) {
        return driver.findElement(locator).getText();
    }
}
