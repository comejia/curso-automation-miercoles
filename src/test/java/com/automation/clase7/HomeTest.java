package com.automation.clase7;

import com.automation.BaseTest;
import com.automation.pages.HomePage;
import org.testng.Assert;

import org.testng.annotations.Test;


public class HomeTest extends BaseTest {

    @Test
    public void homeElementsTest() {
        HomePage homePage = new HomePage(getDriver());

        // 1. Abrir la pagina
        getDriver().get("https://opencart.abstracta.us/");

        // 2. Validar elementos de la home
        Assert.assertTrue(homePage.searchIsDisplayed(), "Search input no visible");
        Assert.assertTrue(homePage.carrouselIsDisplayed(), "Carrousel no visible");
        Assert.assertTrue(homePage.navbarIsDisplayed(), "Navbar no visible");
        Assert.assertTrue(homePage.myAccountDropdownIsDisplayed(), "Dropdown no visible");
    }
}
