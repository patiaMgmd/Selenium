package Habr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_test_1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://habr.com/ru/");

        driver.findElement(By.id("search-form-btn")).click();
        WebElement input = driver.findElement(By.id("search-form-field"));
        input.sendKeys("Selenium");
        input.submit();
        
        List<WebElement> links = driver.findElements(By.xpath("//div[@class='page__body']//h2[@class='post__title']"));

        System.out.println("Результат поиска:" + links.size());

        driver.quit();

    }
}
