package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class imageCompare {
    public static void main(String [] args) throws FindFailed, IOException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();


        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();


        WebElement logo = driver.findElement(By.xpath("//*[@id='imagetrgt']"));
        Screenshot logoTakeShot = new AShot().takeScreenshot(driver,logo);

        ImageIO.write(logoTakeShot.getImage(),"png", new File("C:/Users/DELL/Desktop/sikuli/orange.png"));

        File f = new File("C:/Users/DELL/Desktop/sikuli/orange.png");

        if (f.exists())
        {
            System.out.println("File exits");
        }
        else
        {
            System.out.println("File does not exits");
        }

        BufferedImage expectedImage = ImageIO.read(f);//ImageIO.read(new File("C:/Users/DELL/Desktop/sikuli/orange.png"))

        WebElement logo2 = driver.findElement(By.xpath("//*[@id='imagetrgt']"));
       Screenshot compareImage = new AShot().takeScreenshot(driver,logo2);

       BufferedImage actImage =compareImage.getImage();
       ImageDiffer imgdif = new ImageDiffer();
       ImageDiff dif = imgdif.makeDiff(expectedImage,actImage) ;

       if (dif.hasDiff()==true)
       {
           System.out.println("different");

       }
       else
       {
           System.out.println(" Same");

       }
       driver.quit();




    }
}
