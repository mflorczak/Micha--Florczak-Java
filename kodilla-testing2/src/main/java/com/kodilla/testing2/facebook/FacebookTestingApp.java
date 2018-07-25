package com.kodilla.testing2.facebook;

import com.kodilla.testing2.google.com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_SELECT_DAY = "//div[contains(@class, \"_58mq\")]/div/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"_58mq\")]/div/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"_58mq\")]/div/span/span/select[3]";
//    public static final String XPATH_WAIT_FOR_DAY = "//select[1]";
//    public static final String XPATH_WAIT_FOR_MONTH = "//select[2]";
//    public static final String XPATH_WAIT_FOR_YEAR = "//select[3]";
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("http://www.facebook.com");

        //while(!driver.findElement(By.xpath(XPATH_WAIT_FOR_DAY)).isDisplayed());

        WebElement selectDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select select = new Select(selectDay);
        select.selectByIndex(16);

        //while(!driver.findElement(By.xpath(XPATH_WAIT_FOR_MONTH)).isDisplayed());

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        select = new Select(selectMonth);
        select.selectByIndex(6);

       // while(!driver.findElement(By.xpath(XPATH_WAIT_FOR_YEAR)).isDisplayed());

        WebElement selectYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        select = new Select(selectYear);
        select.selectByValue("1996");
        //16 czerwiec 1996
    }
}
