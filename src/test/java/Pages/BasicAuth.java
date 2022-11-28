package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuth {
    public static void main(String [] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //authenticate poppup
        //http//usename:password@test.com

        driver.get("https://user:pass@authenticationtest.com/HTTPAuth/");

        System.out.println(driver.findElement(By.xpath("//div/h1")).getText());




    }
}
