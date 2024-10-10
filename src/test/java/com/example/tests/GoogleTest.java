package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleTest {
    public static void main(String[] args) {
        // ציין את המיקום של ה-ChromeDriver
        System.setProperty("webdriver.edge.driver", "C:\\driver\\msedgedriver.exe");

        // הגדרות לדפדפן Chrome
        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--remote-allow-origins=*");

        // יצירת מופע של הדפדפן עם ההגדרות
        WebDriver driver = new EdgeDriver();

        // גש לאתר גוגל
        driver.get("https://www.google.com");
        System.out.println("Page title is: " + driver.getTitle());
        WebElement element = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")); // הכנס את ה-ID של האלמנט שאתה בודק
        element.click();
        element.sendKeys("or laharty");
        element.sendKeys(Keys.RETURN); // או inputField.sendKeys(Keys.ENTER);
        //driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
        // סגור את הדפדפן
        //driver.quit();
    }
}
