package com.automation.clase8;

import com.automation.BaseTest;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.pages.MyAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginCorrectoTest() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());

        // 1. Abrir la pagina
        getDriver().get("https://opencart.abstracta.us/");

        // 2. y 3 Ingresar al login
        homePage.goToLogin();

        // 4. Hacer el login
        loginPage.login("cesar@gmail.com", "123456");

        // 5. Validación
        Assert.assertTrue(myAccountPage.titleIsDisplayed(), "El titulo no es visible");
    }

    @Test
    public void loginIncorrectoTest() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());

        // 1. Abrir la pagina
        getDriver().get("https://opencart.abstracta.us/");

        // 2. y 3 Ingresar al login
        homePage.goToLogin();

        // 4. Hacer el login
        loginPage.login("cesar@gmail.com", "56465");

        // 5. Validación
        Assert.assertTrue(loginPage.errorMessageIsDisplayed(), "Mensaje de error no visible");
    }
}
