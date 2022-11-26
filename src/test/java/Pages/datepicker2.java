package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class datepicker2  {

        static WebDriver driver;
        static String month = "December 2022" ;
        static String day = "31" ;
        public static void main(String [] args) throws InterruptedException{

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

            driver.get("https://www.expedia.ca/");

            driver.manage().window().maximize();

            driver.findElement(By.xpath("//*[@id='d1-btn']")).click();//clicking the input field

            while (true)//looping for moving to next calendar
            {
                String text = driver.findElement(By.xpath("//div[2]/div/div[1]/div[2]/div[1]/h2")).getText();// getting the title text of the date picker
                //mathing with  expected date
                if(text.equals(month)){
                    //System.out.println(text);

                    //out of the system after finding the desired output
                    break;

                }
                else
                {
                    driver.findElement(By.xpath("//div[1]/div/div[2]/div/div[1]/div[1]/button[2]")).click(); //clicking the next button
                }

            }

            //finding the correct date
           List<WebElement> a = driver.findElements(By.xpath("//div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr/td/button"));

            for (WebElement b:a)
            {
                String dates =b.getText();
                 String date[] =dates.split(",");

                 if (date[0].equals(day)){
                     b.click();
                     break;
                 }

            }





        }


    }

//div[2]/div/div[1]/div[2]/div[1]/h2

//*[@id="wizard-hotel-pwa-v2-1"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/section/button[1]/span/text()


