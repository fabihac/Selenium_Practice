package Test;
import Pages.GoogleSearch;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public  static void main(String [] args){
        googleSearch();
    }
    private static WebDriver driver = null;

    public static void googleSearch(){
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         driver.get("https://www.google.com/");

        GoogleSearch.textbox_search(driver).sendKeys("Selenium Automation");
        GoogleSearch.button_search(driver).sendKeys(Keys.RETURN);

        driver.close();
    }

}
