package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Funkcje1Test {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement signInButton = driver.findElement(By.className("hide_xs"));
        signInButton.click();
        Thread.sleep(3000);
        WebElement emailInput = driver.findElement(By.className("is_required"));
        emailInput.sendKeys("vbart321c4v312@test.pl");
        Thread.sleep(3000);
        WebElement createAccButton = driver.findElement(By.id("SubmitCreate"));
        createAccButton.click();
        Thread.sleep(3000);

        WebElement firstName = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
        if (firstName.isDisplayed()) {
            firstName.sendKeys("Dawid");
        } else {
            System.out.println("Pole niedostępne");
        }
        Thread.sleep(3000);

        WebElement lastName = driver.findElement(By.xpath("//input[@name='customer_lastname']"));
        if (lastName.isDisplayed()) {
            lastName.sendKeys("Czerwinski");
        } else {
            System.out.println("Pole niedostępne");
        }
        Thread.sleep(3000);

        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        if (email.isDisplayed()) {
            email.clear();
            email.sendKeys("vbart321c4v312@test.pl");
        } else {
            System.out.println("Pole niedostępne");
        }

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        if (password.isDisplayed()) {
            password.sendKeys("haslo41231");
        } else {
            System.out.println("Pole niedostępne");
        }
        Thread.sleep(3000);

        WebElement register = driver.findElement(By.xpath("//span[contains(text(), 'Register')]"));
        if (register.isDisplayed()) {
            register.click();
        } else {
            System.out.println("Przycisk niedostepny");
        }
        Thread.sleep(3000);


        driver.quit();
    }
}
