package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
    public void loginAnAlreadyRegisteredUser() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        System.out.println("Opened homepage.");

        WebElement accountBtn = driver.findElement(By.xpath("//div[@class='account-cart-wrapper']//span[@class='label']"));
        accountBtn.click();

        WebElement loginLink = driver.findElement(By.xpath("//div[@class='links']//a[@title='Log In']"));
        loginLink.click();

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("lucian_lrl@yahoo.com");

        Thread.sleep(2500);


        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("eduard2008");

        Thread.sleep(2500);

        WebElement loginButton = driver.findElement(By.xpath("//span[text() ='Login']"));
        loginButton.click();

        Thread.sleep(2500);

        driver.quit();
    }
    @Test
    public void loginWithAWrongEmail () throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        System.out.println("Opened homepage.");

        WebElement accountBtn = driver.findElement(By.xpath("//div[@class='account-cart-wrapper']//span[@class='label']"));
        accountBtn.click();

        WebElement loginLink = driver.findElement(By.xpath("//div[@class='links']//a[@title='Log In']"));
        loginLink.click();

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("test_email@yahoo.com");

        Thread.sleep(2500);


        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("123456789");

        Thread.sleep(2500);

        WebElement loginButton = driver.findElement(By.xpath("//span[text() ='Login']"));
        loginButton.click();

        Thread.sleep(2500);

        driver.quit();
    }

    @Test
    public void loginWithExistingEmailAndWrongPassword () throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        System.out.println("Opened homepage.");

        WebElement accountBtn = driver.findElement(By.xpath("//div[@class='account-cart-wrapper']//span[@class='label']"));
        accountBtn.click();

        WebElement loginLink = driver.findElement(By.xpath("//div[@class='links']//a[@title='Log In']"));
        loginLink.click();

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("lucian_lrl@yahoo.com");

        Thread.sleep(2500);


        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("123456789");

        Thread.sleep(2500);


        WebElement loginButton = driver.findElement(By.xpath("//span[text() ='Login']"));
        loginButton.click();

        Thread.sleep(2500);

        driver.quit();

    }

    @Test
    public void logoutFromAnExistingAccount () throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        System.out.println("Opened homepage.");

        WebElement accountBtn = driver.findElement(By.xpath("//div[@class='account-cart-wrapper']//span[@class='label']"));
        accountBtn.click();

        WebElement loginLink = driver.findElement(By.xpath("//div[@class='links']//a[@title='Log In']"));
        loginLink.click();

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("lucian_lrl@yahoo.com");

        Thread.sleep(2500);


        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("eduard2008");

        Thread.sleep(2500);

        WebElement loginButton = driver.findElement(By.xpath("//span[text() ='Login']"));
        loginButton.click();

        Thread.sleep(1500);
        WebElement accountBtn1 = driver.findElement(By.xpath("//div[@class='account-cart-wrapper']//span[@class='label']"));
        accountBtn1.click();;

        Thread.sleep(1500);
        WebElement logoutLink = driver.findElement(By.xpath("//div[@class='links']//a[@title='Log Out']"));
        logoutLink.click();

        Thread.sleep(10000);

        driver.quit();
    }
}
