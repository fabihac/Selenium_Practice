package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class downloadZipfile {
    public static void main(String [] args) {

        WebDriverManager.firefoxdriver().setup();

        //Browser profile
        FirefoxProfile Profile = new FirefoxProfile();
        Profile.setPreference("browser.helperApps.neverAsk","application/zip");//setting MIME types
        Profile.setPreference("browser.download.manager.showWhenStarting",false);

        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(Profile);

        WebDriver driver = new FirefoxDriver(options);

        driver.manage().window().maximize();

        //first method
        driver.get("http://testingmasters.com/student-corner/downloads/");
        driver.findElement(By.xpath("//*[@id='tablepress-7']/tbody/tr[1]/td[2]/a")).click();


    }
}
