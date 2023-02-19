package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SzukanieByName {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement hotelLocationInput = driver.findElement(By.name("hotel_location"));
        hotelLocationInput.clear();
        hotelLocationInput.sendKeys("Warsaw");
        Thread.sleep(3000);
        WebElement newsletterInput = driver.findElement(By.name("email"));
        newsletterInput.clear();
        newsletterInput.sendKeys("test@test.com");
        Thread.sleep(3000);
        WebElement searchNowButton = driver.findElement(By.name("search_room_submit"));
        searchNowButton.submit();
        Thread.sleep(3000);
        WebElement subscribeButton = driver.findElement(By.name("submitNewsletter"));
        Thread.sleep(3000);
        driver.quit();
    }
}
