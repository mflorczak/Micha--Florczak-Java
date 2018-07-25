package com.kodilla.testing2.google;

import com.kodilla.testing2.google.com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {
    public static final String SEARCHFILE = "lst-ib";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("http://www.google.com");

        WebElement searchFiled = driver.findElement(By.id(SEARCHFILE));
        searchFiled.sendKeys("Kodilla");

    }
}
