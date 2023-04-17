package com.kodilla.selenium.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KodillaLoginPom extends AbstractPom {

    @FindBy(css = "input[id='email']")
    static WebElement emailField;

    @FindBy(css = "input[id='password']")
    static WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(), 'Log in')]")
    WebElement loginButton;


    public KodillaLoginPom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean login(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
        Alert alert = driver.switchTo().alert();
        String message = alert.getText();
        alert.dismiss();
        return message.equals("Jesteś teraz zalogowany!");
    }

    public void close() {

        driver.close();
    }
}
