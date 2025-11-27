package com.automation.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Hooks {

    private static WebDriver driver;
    private static Properties properties;

    @Before
    public void setup() throws IOException {
        properties = new Properties();

        properties.load(
                new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/config.properties")
        );

        String browser = properties.getProperty("browser");

        switch (browser) {
            case "chrome":
                driver = getChromeDriver();
                break;
            case "firefox":
                driver = getFirefoxDriver();
                break;
            default:
                throw new RuntimeException("Navegador no soportado");
        }
    }

    private WebDriver getChromeDriver() {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("start-maximized");
        options.addArguments("incognito");

        //options.addArguments("headless");
        //options.setCapability("headless", properties.getProperty("headless"));

        options.setPageLoadTimeout(Duration.ofSeconds(60));

        // ruta al binario del driver
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

        return new ChromeDriver(options);
    }

    private WebDriver getFirefoxDriver() {
        FirefoxOptions options = new FirefoxOptions();

        options.addArguments("--private");
        options.setPageLoadTimeout(Duration.ofSeconds(60));
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");

        return new FirefoxDriver(options);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static String getProperty(String property) {
        return properties.getProperty(property);
    }
}
