package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class switchingTabs {

    public static void main(String [] args){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.automationtesting.in/Windows.html");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//div[@id = 'Tabbed']/a/button")).click();

        System.out.println("First title -"+driver.getTitle());

        Set <String>window = driver.getWindowHandles();//storing multiple things and adding string casting//it is capturing window ids

        for (String i:window){
           String p = driver.switchTo().window(i).getTitle();
           System.out.println(p);

           if(p.contains("Frames & windows")){
               driver.close();
           }
        }


    }
}
