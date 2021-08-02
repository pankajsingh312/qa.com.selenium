package com.qa.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {

    public static WebDriver driver;

    //Method to launch browser
    public void launchbrowser() throws IOException {

        Properties prop= new Properties();
        File f= new File("D:\\Test\\Selenium\\src\\main\\java\\com\\qa\\automation\\Config.Properties");
        FileInputStream fis= new FileInputStream(f);
        prop.load(fis);
        String BrowserType = prop.getProperty("Browser");
        String OfficeName = prop.getProperty("OffName");
        String UserName = prop.getProperty("OffName");
        String urls = prop.getProperty("url");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(urls);
    }

    public void closebrowser()
    {
        driver.quit();
    }
}
