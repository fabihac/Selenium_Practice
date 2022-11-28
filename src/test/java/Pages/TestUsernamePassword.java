package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestUsernamePassword {

    static  WebDriver driver;
    public static void main (String[] args){
        //Driver setup
        WebDriverManager.chromedriver().setup();

        // invoke the browser
       // driver = new ChromeDriver();

        //Headless browser---
        ChromeOptions dr = new ChromeOptions();
        dr.setHeadless(true);
        driver =  new ChromeDriver(dr);

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();//maximize the window

        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("problem_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        String ExpTitle = "Swag Labs";
        String ActualTitle = driver.getTitle();

        System.out.println(ActualTitle);

        //Assert.assertEquals(ExpTitle,ActualTitle);

        if (ExpTitle.equals(ActualTitle)){
            System.out.println("Test Passed");
        }
        else
        {
            System.out.println(("Test failed"));
        }
        System.out.println("Current URL: " +driver.getCurrentUrl());

        //get text of a element
        String print = driver.findElement(By.xpath("//div[@class = 'footer_copy']")).getText();

        System.out.println(print);

        driver.close();// closes single window

        driver.quit();//closes multiple window at a time



    }
}
