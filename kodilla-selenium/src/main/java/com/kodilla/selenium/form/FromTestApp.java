package com.kodilla.selenium.form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FromTestApp {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://kodilla.com/pl/test/form");

//        WebElement yearCombo = driver.findElement(By.xpath("//select[3]"));
//        Select yearSelect = new Select(yearCombo);
//        yearSelect.selectByIndex(5);

        WebElement yearCombo = driver.findElement(By.xpath("//*[@id=\"birthday_wrapper\"]/select[3]"));
        Select yearSelect = new Select(yearCombo);
        yearSelect.selectByIndex(5);
    }
}
