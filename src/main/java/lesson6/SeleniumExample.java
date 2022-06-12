package lesson6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample {

    static WebDriver webDriver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/vtorov/Downloads/chromedriver_2");
        webDriver = new ChromeDriver();
        webDriver.get("https://www.novostroy.su");
        webDriver.manage().window().maximize();

        WebElement searchFieldInput = webDriver.findElement(By.xpath("//input[@class='search-field-input']"));
        searchFieldInput.sendKeys("Площадь Ленина");

        Thread.sleep(1000); //Пауза в 1 сек.

        WebElement targetSearchObject = webDriver.findElement(By.xpath("//a[@class='search-helper-active__name']"));
        targetSearchObject.click();

        WebElement searchSubmitButton = webDriver.findElement(By.xpath("//button[@class='find-button__btn']"));
        searchSubmitButton.click();

        Thread.sleep(5000);

        webDriver.quit(); //Выходим
    }
}
