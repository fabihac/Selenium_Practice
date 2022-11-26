package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {
     static WebDriver driver;
    public static void main(String [] args){

        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();

         driver.get("https://arctic.fo/?gclid=EAIaIQobChMIyenRsYGR-gIVDhwrCh0I9gISEAAYASAAEgLhPfD_BwE");

         driver.manage().window().maximize();

         driver.findElement(By.xpath("//input[@id= 'fromPicker']")).click();//clicking the input field

         for (int i=4; i>=1;i--)//looping for moving to next calendar
         {
             driver.findElement(By.xpath("//a[contains(.,'Next')]")).click(); //clicking the next button

             String m = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div")).getText();// getting the title text of the date picker


             //mathing with  expected date
             if(m.equals("December 2022")){
                 System.out.println(m);
                 //finding the correct date
                 driver.findElement(By.linkText("31")).click();


                 //out of the system after finding the desired output
                 break;

             }



         }






    }
}
