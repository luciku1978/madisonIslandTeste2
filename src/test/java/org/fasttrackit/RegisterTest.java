package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.UUID;

public class RegisterTest {

    @Test
    public void addNewUserFromRegister() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        System.out.println("Opened homepage.");

        WebElement accountBtn = driver.findElement(By.xpath("//div[@class='account-cart-wrapper']//span[@class='label']"));
        accountBtn.click();

        WebElement registerBtn = driver.findElement(By.xpath("//div[@class='links']//a[@title='Register']"));
        registerBtn.click();

        Thread.sleep(2500);

        WebElement firstName = driver.findElement(By.id("firstname"));
        firstName.sendKeys("Albert");

        Thread.sleep(2500);

        WebElement middleName = driver.findElement(By.id("middlename"));
        middleName.sendKeys("Gaudi");

        Thread.sleep(2500);

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Velmar");

        Thread.sleep(2500);

        final String uniqueEmail = generateUniqueEmail();

        WebElement email = driver.findElement(By.className("validate-email"));
        email.sendKeys(uniqueEmail);

        Thread.sleep(2500);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("123456");

        Thread.sleep(2500);

        WebElement confirmPasword = driver.findElement(By.name("confirmation"));
        confirmPasword.sendKeys("123456");

        Thread.sleep(2500);

        WebElement signUpForNewsletter = driver.findElement(By.className("checkbox"));
        signUpForNewsletter.click();

        Thread.sleep(2500);

        WebElement register = driver.findElement(By.xpath("//div[@class='buttons-set']//button[@title='Register']"));
        register.click();

        Thread.sleep(2500);

        driver.quit();
    }

    private static String generateUniqueEmail() {
        return "random-" + UUID.randomUUID().toString() + "@email.com";
    }

    @Test
    public void addUserWithExistingEmail() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        System.out.println("Opened homepage.");

        WebElement accountBtn = driver.findElement(By.xpath("//div[@class='account-cart-wrapper']//span[@class='label']"));
        accountBtn.click();

        WebElement registerBtn = driver.findElement(By.xpath("//div[@class='links']//a[@title='Register']"));
        registerBtn.click();

        Thread.sleep(2500);

        WebElement firstName = driver.findElement(By.id("firstname"));
        firstName.sendKeys("paul");

        Thread.sleep(2500);

        WebElement middleName = driver.findElement(By.id("middlename"));
        middleName.sendKeys("goma");

        Thread.sleep(2500);

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("marin");

        Thread.sleep(2500);

        WebElement email = driver.findElement(By.className("validate-email"));
        email.sendKeys("lucian_lrl@yahoo.com");

        Thread.sleep(2500);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("123456");

        Thread.sleep(2500);

        WebElement confirmPasword = driver.findElement(By.name("confirmation"));
        confirmPasword.sendKeys("123456");

        Thread.sleep(2500);

        WebElement signUpForNewsletter = driver.findElement(By.className("checkbox"));
        signUpForNewsletter.click();

        Thread.sleep(2500);

        WebElement register = driver.findElement(By.xpath("//div[@class='buttons-set']//button[@title='Register']"));
        register.click();

        Thread.sleep(2500);

        driver.quit();

    }

    @Test
    public void addUserWithoutFirstName() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        System.out.println("Opened homepage.");

        WebElement accountBtn = driver.findElement(By.xpath("//div[@class='account-cart-wrapper']//span[@class='label']"));
        accountBtn.click();

        WebElement registerBtn = driver.findElement(By.xpath("//div[@class='links']//a[@title='Register']"));
        registerBtn.click();

        Thread.sleep(2500);
//        WebElement firstName = driver.findElement(By.id("firstname"));
//        firstName.sendKeys("paul");

        WebElement middleName = driver.findElement(By.id("middlename"));
        middleName.sendKeys("mike");

        Thread.sleep(2500);

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("martin");

        Thread.sleep(2500);

        WebElement email = driver.findElement(By.className("validate-email"));
        email.sendKeys("martin@yahoo.com");

        Thread.sleep(2500);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("123456");

        Thread.sleep(2500);

        WebElement confirmPasword = driver.findElement(By.name("confirmation"));
        confirmPasword.sendKeys("123456");

        Thread.sleep(2500);


//        WebElement signUpForNewsletter = driver.findElement(By.className("checkbox"));
//        signUpForNewsletter.click();

        WebElement register = driver.findElement(By.xpath("//div[@class='buttons-set']//button[@title='Register']"));
        register.click();

        Thread.sleep(2500);

        driver.quit();

    }

    @Test
    public void addUserWithoutEmail() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        System.out.println("Opened homepage.");

        WebElement accountBtn = driver.findElement(By.xpath("//div[@class='account-cart-wrapper']//span[@class='label']"));
        accountBtn.click();

        WebElement registerBtn = driver.findElement(By.xpath("//div[@class='links']//a[@title='Register']"));
        registerBtn.click();

        Thread.sleep(2500);

        WebElement firstName = driver.findElement(By.id("firstname"));
        firstName.sendKeys("george");

        Thread.sleep(2500);

        WebElement middleName = driver.findElement(By.id("middlename"));
        middleName.sendKeys("m");

        Thread.sleep(2500);

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("busch");

        Thread.sleep(2500);

        WebElement email = driver.findElement(By.className("validate-email"));
        email.sendKeys("");

        Thread.sleep(2500);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("123456");

        Thread.sleep(2500);

        WebElement confirmPasword = driver.findElement(By.name("confirmation"));
        confirmPasword.sendKeys("123456");


        Thread.sleep(2500);
//        WebElement signUpForNewsletter = driver.findElement(By.className("checkbox"));
//        signUpForNewsletter.click();

        WebElement register = driver.findElement(By.xpath("//div[@class='buttons-set']//button[@title='Register']"));
        register.click();

        Thread.sleep(2500);

        driver.quit();
    }

    @Test
    public void addUserWithInvalidPassword() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        System.out.println("Opened homepage.");

        WebElement accountBtn = driver.findElement(By.xpath("//div[@class='account-cart-wrapper']//span[@class='label']"));
        accountBtn.click();

        WebElement registerBtn = driver.findElement(By.xpath("//div[@class='links']//a[@title='Register']"));
        registerBtn.click();

        Thread.sleep(2500);

        WebElement firstName = driver.findElement(By.id("firstname"));
        firstName.sendKeys("oancea");

        Thread.sleep(2500);

        WebElement middleName = driver.findElement(By.id("middlename"));
        middleName.sendKeys("val");

        Thread.sleep(2500);

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("mihai");

        Thread.sleep(2500);

        WebElement email = driver.findElement(By.className("validate-email"));
        email.sendKeys("oancea@yahoo.com");

        Thread.sleep(2500);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("123");

        Thread.sleep(2500);

        WebElement confirmPasword = driver.findElement(By.name("confirmation"));
        confirmPasword.sendKeys("123");


        Thread.sleep(2500);
//        WebElement signUpForNewsletter = driver.findElement(By.className("checkbox"));
//        signUpForNewsletter.click();

        WebElement register = driver.findElement(By.xpath("//div[@class='buttons-set']//button[@title='Register']"));
        register.click();

        Thread.sleep(2500);

        driver.quit();
    }

    @Test
    public void addUserWhenPasswordsDontMatch () throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        System.out.println("Opened homepage.");

        WebElement accountBtn = driver.findElement(By.xpath("//div[@class='account-cart-wrapper']//span[@class='label']"));
        accountBtn.click();

        WebElement registerBtn = driver.findElement(By.xpath("//div[@class='links']//a[@title='Register']"));
        registerBtn.click();

        Thread.sleep(2500);

        WebElement firstName = driver.findElement(By.id("firstname"));
        firstName.sendKeys("alecu");

        Thread.sleep(2500);

        WebElement middleName = driver.findElement(By.id("middlename"));
        middleName.sendKeys("ryan");

        Thread.sleep(2500);

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("bill");

        Thread.sleep(2500);

        WebElement email = driver.findElement(By.className("validate-email"));
        email.sendKeys("bill@yahoo.com");

        Thread.sleep(2500);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("11111111");

        Thread.sleep(2500);

        WebElement confirmPasword = driver.findElement(By.name("confirmation"));
        confirmPasword.sendKeys("11234564");

        Thread.sleep(2500);

//        WebElement signUpForNewsletter = driver.findElement(By.className("checkbox"));
//        signUpForNewsletter.click();

        WebElement register = driver.findElement(By.xpath("//div[@class='buttons-set']//button[@title='Register']"));
        register.click();

        Thread.sleep(2500);

        driver.quit();
    }

    @Test
    public void addUserWithInvalidEmailAdress () throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        System.out.println("Opened homepage.");

        WebElement accountBtn = driver.findElement(By.xpath("//div[@class='account-cart-wrapper']//span[@class='label']"));
        accountBtn.click();

        WebElement registerBtn = driver.findElement(By.xpath("//div[@class='links']//a[@title='Register']"));
        registerBtn.click();

        Thread.sleep(2500);

        WebElement firstName = driver.findElement(By.id("firstname"));
        firstName.sendKeys("calin");

        Thread.sleep(2500);

        WebElement middleName = driver.findElement(By.id("middlename"));
        middleName.sendKeys("file");

        Thread.sleep(2500);

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("poveste");

        Thread.sleep(2500);

        WebElement email = driver.findElement(By.className("validate-email"));
        email.sendKeys("calinyahoo.com");

        Thread.sleep(2500);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("000000");

        Thread.sleep(2500);

        WebElement confirmPasword = driver.findElement(By.name("confirmation"));
        confirmPasword.sendKeys("000000");

        Thread.sleep(2500);

//        WebElement signUpForNewsletter = driver.findElement(By.className("checkbox"));
//        signUpForNewsletter.click();

        WebElement register = driver.findElement(By.xpath("//div[@class='buttons-set']//button[@title='Register']"));
        register.click();

        Thread.sleep(2500);

        driver.quit();

    }
}

