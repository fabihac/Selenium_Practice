package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;

public class scolling {
    public static void main(String [] args) throws FindFailed {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();


        driver.get("https://www.theflagshop.co.uk/world-cup-2022-flags.html");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        //scolling using pixel
        //js.executeScript("window.scrollBy(0,1000)","");

        //scolling using pixel
        WebElement flag = driver.findElement(By.xpath("//*[@id='maincontent']/div/div[1]/div[6]/ol/li[18]/div/div/strong/a"));
        js.executeScript("arguments[0].scrollIntoView();",flag);


    }
}
