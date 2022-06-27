package lesson6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTaskOne {
    static WebDriver webDriver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/103.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://www.novostroy.su");
        webDriver.manage().window().maximize();

        Thread.sleep(1000);

        WebElement targetSearchMortrage = webDriver.findElement(By.xpath("//a[text()='Ипотека']"));
        targetSearchMortrage.click();

        Thread.sleep(2000);

        WebElement percentFieldInput = webDriver.findElement(By.xpath("//input[@id='percent']"));
        percentFieldInput.sendKeys("10");

        Thread.sleep(1000);

        WebElement sumFieldInput = webDriver.findElement(By.xpath("//input[@id='sum']"));
        sumFieldInput.sendKeys("5000000");

        Thread.sleep(1000);

        WebElement termFieldInput = webDriver.findElement(By.xpath("//input[@id='term']"));
        termFieldInput.sendKeys("20");

        Thread.sleep(1000);

        WebElement targetSearchCapital = webDriver.findElement(By.xpath("//li[@class='checkbox-btn']"));
        targetSearchCapital.click(); //это конечно работает, но только с первым чекбоксом

        Thread.sleep(1000);

        WebElement targetSearchShow = webDriver.findElement(By.xpath("//button[@class='mainbtn mortgage-block__filter-submit-btn']"));
        targetSearchShow.click();

        Thread.sleep(5000);

        webDriver.quit(); //Выходим
    }
}
