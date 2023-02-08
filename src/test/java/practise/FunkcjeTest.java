package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunkcjeTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        WebElement title = driver.findElement(By.className("header-hotel-name"));
        System.out.println(title.getText()); // ważne

        WebElement button = driver.findElement(By.id("search_room_submit"));
        System.out.println(button.getAttribute("class"));

        System.out.println(button.getTagName());

        if (button.isDisplayed()) {
            System.out.println("widoczny");     // ważne
        } else {
            System.out.println("niewidoczny");
        }


        driver.quit();
    }
}
