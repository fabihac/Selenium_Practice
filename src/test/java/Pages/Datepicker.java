package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
    static WebDriver driver;
     static String month = "December 2022" ;
     static String day = "31" ;
    public static void main(String [] args){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://phptravels.net/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id='checkin']")).click();//clicking the input field

        while (true)//looping for moving to next calendar
        {
            String text = driver.findElement(By.xpath("//div[6]/div[1]/table/thead/tr[1]")).getText();// getting the title text of the date picker
            //mathing with  expected date
            if(text.equals(month)){
                System.out.println(text);

                //out of the system after finding the desired output
                break;

            }
            else
            {
                driver.findElement(By.xpath("//div[6]/div[1]/table/thead/tr[1]/th[3]")).click(); //clicking the next button
            }

        }

        //finding the correct date
        driver.findElement(By.xpath("//div[6]/div[1]/table/tbody/tr[5]/td[contains(text(),"+day+")]")).click();




        }


    }

