package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class downloadfile {
    public static void main(String [] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        //first method
        driver.get("https://demo.automationtesting.in/FileDownload.html");
        driver.findElement(By.xpath("//*[@id='textbox']")).sendKeys("Testing the first download file");
        driver.findElement(By.xpath("//*[@id='createTxt']")).click();
        driver.findElement(By.xpath("//*[@id='link-to-download']")).click();

        Thread.sleep(5000);

       if (isFileExist("C:\\Users\\DELL\\Downloads\\info.txt\\")){
           System.out.println("File exits");
       }
       else {
           System.out.println("File does not exits");
       }

        //2nd method

        driver.findElement(By.xpath("//*[@id='pdfbox']")).sendKeys("Testing the 2nd download file");
        driver.findElement(By.xpath("//*[@id='createPdf']")).click();
        driver.findElement(By.xpath("//*[@id='pdf-link-to-download']")).click();

        Thread.sleep(5000);

        if (isFileExist("C:\\Users\\DELL\\Downloads\\info.pdf\\")){
            System.out.println("File exits");
        }
        else {
            System.out.println("File does not exits");
        }




    }

    //verification
    static boolean isFileExist(String path){
        File f = new File(path);

        if (f.exists()){
            return true;
        }
        else {
            return false;
        }

    }
}
