package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Frames {

    public static void main(String [] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //first test
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("//div[2]/div[1]/button")).click();

        //accept alertbox
        System.out.println(driver.switchTo().alert().getText());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.switchTo().alert().accept();


        //Second test
        driver.findElement(By.xpath("//div[1]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id='CancelTab']/button")).click();

        //decline alertbox
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.switchTo().alert().dismiss();
        String ExpT = "You Pressed Cancel";
        String AcT = driver.findElement(By.xpath("//div/div[2]/p")).getText();


        if(ExpT.equals(AcT) == true){
            System.out.println("Test passed");
        }

        //Third test
        driver.findElement(By.xpath("//div[1]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id='Textbox']/button")).click();

        //write in alertbox

        driver.switchTo().alert().sendKeys("Fabiha");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.switchTo().alert().accept();
        String ExpT1 = "Hello Fabiha How are you today";
        String AcT1 = driver.findElement(By.xpath("//*[@id='demo1']")).getText();
        if(ExpT1.equals(AcT1) == true){
            System.out.println("Test passed for Name field");
        }
        //cancelling texted poppup
        driver.findElement(By.xpath("//*[@id='Textbox']/button")).click();
        driver.switchTo().alert().dismiss();
        System.out.println("Blank field"+ driver.findElement(By.xpath("//*[@id='demo1']")).getText());





    }
}
