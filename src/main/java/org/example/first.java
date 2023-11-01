package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class first

{
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Test_java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        driver.findElement(By.id("small-searchterms"));
        WebElement search = driver.findElement(By.id("small-searchterms"));
        search.sendKeys("Lenovo");
        search.submit();
        driver.quit();

    }
}