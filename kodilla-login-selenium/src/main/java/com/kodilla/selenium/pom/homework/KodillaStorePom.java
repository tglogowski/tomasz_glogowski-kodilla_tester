package com.kodilla.selenium.pom.homework;

import com.kodilla.selenium.pom.AbstractPom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class KodillaStorePom extends AbstractPom {

    List<WebElement> results;

    @FindBy(css = "input[id='searchField']")
    static WebElement inputField;

    @FindBy(css = "h3[class='text-center missing']")
    static WebElement dialogBox;

    @FindBy(css = "div[class='elements-wrapper']")
    static WebElement resultsBox;

    public KodillaStorePom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public int search(String articleName) {

        inputField.sendKeys(articleName);
        results = resultsBox.findElements(By.className("element"));
        return results.size();

    }

    public void close() {
        driver.close();
    }
}