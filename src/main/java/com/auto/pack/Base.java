package com.auto.pack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.lang.invoke.SwitchPoint;

public class Base {
    public WebDriver driver;

    public WebDriver initBrowsertype(String BrowserType)
    {
        switch (BrowserType)
        {
            case "Chrome" :
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            case "Firefox" :
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            case "Edge" :
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            case "Safari" :
                WebDriverManager.safaridriver().setup();
                driver = new SafariDriver();
        }
        return driver;
    }
}
