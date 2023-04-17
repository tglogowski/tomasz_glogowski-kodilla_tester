package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaStorePomApp {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\BootCAMP\\00_Projects\\kodilla-course\\kodilla-login-selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        KodillaStorePom store = new KodillaStorePom(driver);
    }
}