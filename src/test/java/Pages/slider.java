package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {
    public static void main(String [] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("https://demo.automationtesting.in/Slider.html");

        //driver.switchTo().frame(0);//frame index

        WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/a"));

        Actions act = new Actions(driver);

        //x axis should be move and y should be 0 for dragging a slider
        act.moveToElement(slider).dragAndDropBy(slider,500,0).build().perform();


}}
