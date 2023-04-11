package com_nopcommerce;
/**
 * Project-1 - Project Name: com-nopcommerce
 * BaseUrl = https://demo.nopcommerce.com/login?returnUrl=%2F
 * 1. Setup Chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";   //Declared String variable 'baseUrl' to store URL address.
        WebDriver driver = new ChromeDriver();              //To open the browser with jar file pre-build
        driver.get(baseUrl);                                //To open the URL into Browser using Get method
        driver.manage().window().maximize();                //To maximise the browser
        System.out.println(driver.getTitle());              //Get the Title of the page using getTitle method
        System.out.println("Current URL: " + driver.getCurrentUrl());   //Get the current URL by using getCurrentUrl method
        System.out.println("Page Source: " + driver.getPageSource());   //Get the page source by using getPageSource method
        driver.findElement(By.id("Email")).sendKeys("prime123@gmail.com"); //Find the login link and enter user ID
        driver.findElement(By.id("Password")).sendKeys("Prime@1");         //Find the password link and enter password
        driver.close();                                    //To close the browser
    }
}
