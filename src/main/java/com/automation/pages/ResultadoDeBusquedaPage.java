package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultadoDeBusquedaPage {

    private By titleSearch = By.xpath("//h1[text()=\"Search - iphone\"]");

    private WebDriver driver;

    public ResultadoDeBusquedaPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        WebElement element = driver.findElement(titleSearch);
        return element.getText();
    }
}
