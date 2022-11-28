package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class downloadfileusingfirefox {

    public static void main(String [] args) {

        WebDriverManager.firefoxdriver().setup();

        //Browser profile
        FirefoxProfile Profile = new FirefoxProfile();
        Profile.setPreference("browser.helperApps.neverAsk","text/plain,application/pdf");//setting MIME types
        Profile.setPreference("browser.download.manager.showWhenStarting",false);
        Profile.setPreference("pdfjs.disabled",true);

        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(Profile);

        WebDriver driver = new FirefoxDriver(options);

        driver.manage().window().maximize();

        //first method
        driver.get("https://demo.automationtesting.in/FileDownload.html");
        driver.findElement(By.xpath("//*[@id='textbox']")).sendKeys("Testing the firstdownload file");
        driver.findElement(By.xpath("//*[@id='createTxt']")).click();
        driver.findElement(By.xpath("//*[@id='link-to-download']")).click();
        //2nd method

        driver.findElement(By.xpath("//*[@id='pdfbox']")).sendKeys("Testing the 2nd download file");
        driver.findElement(By.xpath("//*[@id='createPdf']")).click();
        driver.findElement(By.xpath("//*[@id='pdf-link-to-download']")).click();
    }
}
