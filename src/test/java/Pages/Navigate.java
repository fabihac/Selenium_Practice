package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class Navigate {

    static WebDriver driver;
    static WebElement element;
    public static void main (String [] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        System.out.println("Title is : "+driver.getTitle());

        driver.navigate().to("https://www.globalsqa.com/samplepagetest/");
        System.out.println("Title is "+driver.getTitle());

        driver.navigate().back();
        System.out.println("Title is "+driver.getTitle());

        driver.navigate().forward();
        System.out.println("Title is "+driver.getTitle());

        WebElement Email =  driver.findElement(By.id("g2599-name"));
        WebElement Pass = driver.findElement(By.id("g2599-email"));

        if (Email.isDisplayed() && Email.isEnabled()){
            Email.sendKeys("Fabiha Chowdhury");

        }
        if (Pass.isDisplayed() && Pass.isEnabled()) {
           Pass.sendKeys("fabiha.marzan@gmailcom");
        }



            WebElement click = driver.findElement(By.name("g2599-expertise[]"));
            Boolean isSelected = click.isSelected();

            if (isSelected == false) {
                click.click();
            }

           // driver.findElement(By.linkText(""))

        
            //driver.findElement(By.cssSelector(#input#email));input.email//

        //starts-with() //contains




    }
}


