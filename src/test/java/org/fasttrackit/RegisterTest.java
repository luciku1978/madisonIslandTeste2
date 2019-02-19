package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.UUID;

public class RegisterTest {

    @Test
    public  void addNewUserFromRegister() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        System.out.println("Opened homepage.");

        WebElement accountBtn = driver.findElement(By.xpath("//div[@class='account-cart-wrapper']//span[@class='label']"));
        accountBtn.click();

        WebElement registerBtn = driver.findElement(By.xpath("//div[@class='links']//a[@title='Register']"));
        registerBtn.click();

        WebElement firstName = driver.findElement(By.id("firstname"));
        firstName.sendKeys("ALBERT");

        WebElement middleName = driver.findElement(By.id("middlename"));
        middleName.sendKeys("GEORGE");

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("EINSTEIN");

        final String uniqueEmail = generateUniqueEmail();

        WebElement email = driver.findElement(By.className("validate-email"));
        email.sendKeys(uniqueEmail);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("12345");

        WebElement confirmPasword = driver.findElement(By.name("confirmation"));
        confirmPasword.sendKeys("12345");

        WebElement signUpForNewsletter = driver.findElement(By.className("checkbox"));
        signUpForNewsletter.click();
        
    }
        private static String generateUniqueEmail() {
            return "random-" + UUID.randomUUID().toString() + "@email.com";
        }

    }

