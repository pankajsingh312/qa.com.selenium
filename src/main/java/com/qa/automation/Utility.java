package com.qa.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {

    public static void main(String[] args) throws IOException {


        File f= new File("D:\\Test\\Selenium\\src\\main\\java\\com\\qa\\automation\\Config.Properties");
        FileInputStream fis= new FileInputStream(f);
        Properties prop= new Properties();
        prop.load(fis);
        String s = prop.getProperty("Browser");
        System.out.println(s);

        PageFactory.initElements();
        @Test

    }


}
