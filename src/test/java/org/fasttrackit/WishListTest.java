package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishListTest {

    @Test
    public void addProductFromSaleToWishList(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        System.out.println("Opened homepage.");

        driver.findElement(By.xpath("//a[text()='Sale']")).click();
        driver.findElement(By.xpath("//a[@title='View Details']")).click();
        driver.findElement(By.className("link-wishlist")).click();

    }
}
