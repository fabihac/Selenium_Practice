package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import  org.openqa.selenium.firefox.FirefoxDriver;
import  org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class BrowserTest {

    static String browser;
    static WebDriver driver;


    public static void main(String[] args){

        setBrowser();
        setBrowserConfig();
        runTest();

    }
    //setbrowser
    //setbrowserconfig
    //runtest

    public static void setBrowser(){
       browser = "Chrome";

    }
    public static  void  setBrowserConfig(){
        if (browser.contains("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }


        if (browser.contains("Chrome")){
            WebDriverManager.chromedriver().setup();
             driver = new ChromeDriver();

        }

        if (browser.contains("Edge")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();

        }
    }
    public static  void  runTest(){
        driver.get("https://www.google.com/");
         //textBox = driver.findElement(By.name("q"));
        //textBox = driver.findElement(By.tagName("input"));
        driver.findElement(By.xpath("//input[@name = 'q']")).sendKeys("Selenium");
        //driver.findElement(By.name("btnK")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.RETURN);

        //wait for 10 seconds to load next second (implicit wait)
        //default wait 250ms

        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        //specific element specific condition (explicit wait)

        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("1q")));








        driver.close();
        //driver.quit();

    }
}
