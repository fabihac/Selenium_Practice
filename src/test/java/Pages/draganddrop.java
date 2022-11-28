package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
    public static void main(String [] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //MouseOver
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement source =  driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement target =  driver.findElement(By.xpath("//*[@id='droppable']"));

        Actions act = new Actions(driver);

        //two ways to drag and drop image
        //way1
        act.clickAndHold(source).moveToElement(target).release().build().perform();

        //way2
        //act.dragAndDrop(source,target).build().perform();
       System.out.println(driver.findElement(By.xpath("//*[@id='droppable']/p")).getText());


    }
}
