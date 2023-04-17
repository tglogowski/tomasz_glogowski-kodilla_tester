package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class KodillaStoreTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");


        WebElement privacyAcceptButton = driver.findElement(By.cssSelector("div > button"));
        privacyAcceptButton.click();
        privacyAcceptButton.wait(2000);

        WebElement categoriesCombo = driver.findElement(By.cssSelector("div > form > div:nth-child(4) > div > select"));
        Select categorieSelect = new Select(categoriesCombo);
        categorieSelect.selectByIndex(3);

        WebElement inputField = driver.findElement(By.cssSelector("div > form > input"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();

        List<WebElement> searchResult = driver.findElements(By.cssSelector(
                "div.opbox-listing > div > section > article > div >" +
                        " div > div:nth-child(2) > div > h2 > a"));

        for (WebElement results : searchResult) {
            System.out.println(results.getText() + "\n");
        }
    }
}
