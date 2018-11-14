package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_INPUT_NAME = "//div[contains(@class, \"uiStickyPlaceholderInput\")]/input";
    public static final String XPATH_INPUT_LASTNAME = "//div[contains(@class, \"uiStickyPlaceholderInput\")]/input[contains(@name, \"lastname\")]";

    //public static final String XPATH_SELECT_DAY = "//span[contains(@class, \"_5k_4\")]/select[1]";
    public static final String XPATH_SELECT_DAY = "//select[contains(@name, \"birthday_day\")]";
    public static final String XPATH_SELECT_MONTH = "//select[contains(@name, \"birthday_month\")]";
    public static final String XPATH_SELECT_YEAR = "//select[contains(@name, \"birthday_year\")]";

    public static void main (String [] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");



        //while (!driver.findElement(By.xpath(XPATH_SELECT)).isDisplayed());

        WebElement inputFirstname = driver.findElement(By.xpath(XPATH_INPUT_NAME));
        inputFirstname.sendKeys("Maria");

        WebElement inputLastname = driver.findElement(By.xpath(XPATH_INPUT_LASTNAME));
        inputLastname.sendKeys("Tworkiewicz");

        WebElement selectDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectBday = new Select(selectDay);
        selectBday.selectByIndex(5);

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectBmonth = new Select(selectMonth);
        selectBmonth.selectByIndex(5);

        WebElement selectYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectByear = new Select(selectYear);
        selectByear.selectByIndex(45);
    }
}
