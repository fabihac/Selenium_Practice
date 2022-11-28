package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

    public static void main(String [] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //MouseOver
        driver.get("https://demo.automationtesting.in/Frames.html");

        WebElement switchto = driver.findElement(By.xpath("//div/ul/li[4]"));
        WebElement Alert = driver.findElement(By.xpath("//div/ul/li[4]/ul/li[1]"));


        //taking action class for overing mouse and instantiate the drive class
        Actions act = new Actions(driver);

        //hovering the to perform an action
        act.moveToElement(switchto).moveToElement(Alert).click().build().perform();


    }
}
