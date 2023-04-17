package com.kodilla.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaPomApplication {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\BootCAMP\\00_Projects\\kodilla-course\\kodilla-login-selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/login");
        KodillaLoginPom loginPom = new KodillaLoginPom(driver);
        loginPom.login("test@kodilla.com","haslo");
        loginPom.close();
    }
}



