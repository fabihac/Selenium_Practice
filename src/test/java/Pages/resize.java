package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class resize {
    public static void main(String [] args)  {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("https://demo.automationtesting.in/Resizable.html");
        //driver.switchTo().frame(0);//frame index

        WebElement resize = driver.findElement(By.xpath("//div[@id ='resizable']/div[3]"));

        Actions act = new Actions(driver);

        act.moveToElement(resize).dragAndDropBy(resize,150,50).build().perform();
        //Thread.sleep(2000);

    }
}
