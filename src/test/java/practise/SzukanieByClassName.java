package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SzukanieByClassName {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement signInButton = driver.findElement(By.className("hide_xs"));
        signInButton.click();
        Thread.sleep(3000);
        WebElement emailInput = driver.findElement(By.className("is_required"));
        emailInput.sendKeys("test@test.pl");
        Thread.sleep(3000);
        WebElement createAccButton = driver.findElement(By.id("SubmitCreate"));
        createAccButton.click();

    }
}
