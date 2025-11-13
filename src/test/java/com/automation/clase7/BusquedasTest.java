package com.automation.clase7;

import com.automation.BaseTest;
import com.automation.pages.HomePage;
import com.automation.pages.ResultadoDeBusquedaPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BusquedasTest extends BaseTest {

    @Test
    public void busquedaProductoTest() {
        HomePage homePage = new HomePage(getDriver());
        ResultadoDeBusquedaPage resultadoDeBusquedaPage = new ResultadoDeBusquedaPage(getDriver());

        // 1. Abrir la pagina
        getDriver().get("https://opencart.abstracta.us/");

        // 2. Realizar la busqueda
        homePage.search("iphone");

        // 3. Verificar el esperado (assertion)
        Assert.assertEquals(resultadoDeBusquedaPage.getTitle(), "Search - iphone", "Los titulos no coinciden");
    }
}
