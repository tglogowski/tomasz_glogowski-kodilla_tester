package com.kodilla.selenium.pom.homework;

import com.kodilla.selenium.pom.KodillaLoginPom;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KodillaStorePomTest {

    KodillaStorePom store;

    WebDriver driver;

    List<WebElement> results;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        store = new KodillaStorePom(driver);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/Items.csv", numLinesToSkip = 1)
    public void test_CheckProperItemsNumber(String input, int expected) {
        assertEquals(expected, store.search(input));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/LowerUpperCase.scv", numLinesToSkip = 1)
    public void shouldReturnResultsCaseInsensitive(String input, int expected) {
        assertEquals(expected, store.search(input));
    }

    @AfterEach
    public void testDown() {
        driver.close();
    }

}