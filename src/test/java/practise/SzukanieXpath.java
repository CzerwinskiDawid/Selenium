package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SzukanieXpath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement signInButton = driver.findElement(By.className("hide_xs"));
        signInButton.click();
        Thread.sleep(3000);
        WebElement emailInput = driver.findElement(By.className("is_required"));
        emailInput.sendKeys("tes3213412t@test.pl");
        Thread.sleep(3000);
        WebElement createAccButton = driver.findElement(By.id("SubmitCreate"));
        createAccButton.click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Dawid");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='customer_lastname']")).sendKeys("Czerwinski");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("haslo41231");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[contains(text(), 'Register')]")).click();
        Thread.sleep(3000);

        driver.quit();
    }
}
