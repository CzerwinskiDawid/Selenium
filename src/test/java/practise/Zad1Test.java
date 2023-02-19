package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zad1Test {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://duckduckgo.com/");
        WebElement element = driver.findElement(By.id("search_form_input_homepage"));
        element.clear();
        element.sendKeys("Mecz Polska Argentyna");
        element.submit();
        driver.quit();
    }
}
