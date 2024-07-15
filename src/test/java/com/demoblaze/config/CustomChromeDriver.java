package com.demoblaze.config;

import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CustomChromeDriver implements DriverSource {

    @Override
    public WebDriver newDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Abrir en pantalla completa
        options.addArguments("--kiosk"); // Esto asegura que el navegador se abra en pantalla completa
        return new ChromeDriver(options);
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
