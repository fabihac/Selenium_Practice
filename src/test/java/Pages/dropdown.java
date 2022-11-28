package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class dropdown {
    static WebDriver driver;
    public static void main(String [] args){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.id("animals"));//finding the dropdown box
        Select se = new Select(element);

        List originalList = new ArrayList();
        List tempList = new ArrayList();

         List <WebElement> options=se.getOptions();//capture all options

        for (WebElement e:options){
           originalList.add(e.getText());
           tempList.add(e.getText());
        }

        System.out.println("original list"+originalList+ " ");

        Collections.sort(tempList);

        System.out.println("Temp list"+tempList+ " ");

        if (originalList == tempList){
            System.out.println("The items are sorted");
        }
        else
        { System.out.println("The items are not sorted");}

}
}
