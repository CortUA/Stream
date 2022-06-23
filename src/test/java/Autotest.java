import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Autotest {
    @Test

        public void doit() {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.youtube.com/");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Qa automation");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.RETURN);


        }

}