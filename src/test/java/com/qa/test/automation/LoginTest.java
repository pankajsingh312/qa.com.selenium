package com.qa.test.automation;

import com.qa.automation.Base;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends Base {

    public static void main(String[] args) throws IOException, InterruptedException {

    LoginTest obj= new LoginTest();
    obj.launchbrowser();
    System.out.println(driver.getTitle());
    Thread.sleep(2000);
    obj.closedbrowser();


    }
}
