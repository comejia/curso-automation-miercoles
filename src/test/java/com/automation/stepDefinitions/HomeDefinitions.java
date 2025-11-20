package com.automation.stepDefinitions;

import com.automation.hooks.Hooks;
import com.automation.pages.HomePage;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomeDefinitions {

    private HomePage homePage;

    public HomeDefinitions() {
        homePage = new HomePage(Hooks.getDriver());
    }

    @Dado("que el usuario ingresa a la home")
    public void queElUsarioIngresaALaHome() {
        WebDriver driver = Hooks.getDriver();
        driver.get("https://opencart.abstracta.us/");
    }

    @Entonces("la pantalla de la home se muestra correctamente")
    public void laPantallaDeLaHomeSeMuestraCorrectamente() {
        // 2. Validar elementos de la home
        Assert.assertTrue(homePage.searchIsDisplayed(), "Search input no visible");
        Assert.assertTrue(homePage.carrouselIsDisplayed(), "Carrousel no visible");
        Assert.assertTrue(homePage.navbarIsDisplayed(), "Navbar no visible");
        Assert.assertTrue(homePage.myAccountDropdownIsDisplayed(), "Dropdown no visible");
    }
}
