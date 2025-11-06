package com.automation.clase7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class BusquedasTest {

    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("start-maxized");
        options.addArguments("incognito");

        //options.addArguments("headless");

        options.setPageLoadTimeout(Duration.ofSeconds(60));

        // ruta al binario del driver
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

        this.driver = new ChromeDriver(options);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void busquedaProductoTest() {
        // 1. Abrir la pagina
        driver.get("https://opencart.abstracta.us/");

        // 2. Realizar la busqueda
        By searchInput = By.xpath("//input[@name=\"search\"]");
        //By searchInput = By.name("search");
        By searchButton = By.xpath("//button[@class=\"btn btn-default btn-lg\"]");

        WebElement searchInputEl = driver.findElement(searchInput);
        WebElement searchBtnEl = driver.findElement(searchButton);

        searchInputEl.sendKeys("iphone");

        searchBtnEl.click();

        // 3. Verificar el esperado (assertion)
        By titleSearch = By.xpath("//h1[text()=\"Search - iphone\"]");

        WebElement titleSearchEl = driver.findElement(titleSearch);

        Assert.assertEquals(titleSearchEl.getText(), "Search - iphone", "Los titulos no coinciden");
    }
}
