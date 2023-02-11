package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();  //uruchomienie przeglądarki
        driver.manage().window().maximize();    //zarządzanie przeglądarką (maksymalizacja okna)
        driver.get("https://duckduckgo.com/");  //otwarcie strony którą chcemy
        WebElement element = driver.findElement(By.id("search_form_input_homepage"));   //znalezienie i przypisanie do zmiennej elementu strony
        element.clear();    //
        element.sendKeys("Coderslab" + Keys.ENTER);  //
//        element.submit();   //
        Thread.sleep(5000);   //
        driver.quit();  //






        driver.findElement(By.id("search_room_submit"));
        driver.findElement(By.name("search_room_submit"));
    }
}
