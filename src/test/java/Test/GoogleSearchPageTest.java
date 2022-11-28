package Test;

import Pages.GoogleSearchPageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class GoogleSearchPageTest {

    static WebDriver driver = null;

//    public static void main(String[] args)
//    {
//        googleSearchTest();
//    }
       @Test
    public static void googleSearchTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);

        driver.get("https://www.google.com/");
        searchPageObj.setTextInSearchBox("Automation");
        searchPageObj.clickSearchButton();

        String ExpTitle = "Automation - Google Search";
        Assert.assertEquals(ExpTitle,driver.getTitle());
        driver.close();
    }
}
