package stepDefinition;

import PageObjectModel.RegistrationPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.net.URL;

public class cucumberStepPrac extends Base{
//  public WebDriver driver;
//    public RegistrationPage rp;

    @Before
    public void setup() throws IOException {
        logger = Logger.getLogger("Test Automation");
        PropertyConfigurator.configure("E:/Selenium/Test-OutputDoc/log4j.properties");//added logger
        String  browser ="Chrome";


        if(browser == "Chrome") {
            String NodeUrl = " http://192.168.4.122:34812/wd/hub";
            //Remote environment setup
            DesiredCapabilities cap = DesiredCapabilities.chrome();
            cap.setBrowserName("chrome");
            cap.setPlatform(Platform.WINDOWS);


            WebDriverManager.chromedriver().setup();
            //driver = new ChromeDriver();
            driver = new RemoteWebDriver(new URL(NodeUrl),cap);

        } else if (browser == "Firefox") {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        }else if (browser == "Edge") {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();

        }
        logger.info("opening browser");

    }

    @Given("User launch Browser")
    public void user_launch_Browser() {

        rp = new RegistrationPage(driver);
    }

    @When("User opens URL {string}")
    public void user_opens_url(String url) {
        logger.info("launching browser");
        driver.get(url);
        driver.manage().window().maximize();

    }

    @When("User enters FirstName as {string} and LastName as {string}")
    public void user_enters_first_name_as_and_last_name_as(String FirstName, String LastName) {
        logger.info("enter Name");
        rp.setFirstName(FirstName);
        rp.setLastName(LastName);
    }

    @When("User clicks on Submit button")
    public void user_clicks_on_submit_button() {
      rp.clickButton();
    }

    @Then("Page will show alert")
    public void page_will_show_alert() {
        rp.validationMassage();

    }

    @And("close browser")
    public void close_Browser() throws InterruptedException {
        logger.info("closing");
        Thread.sleep(2000);
        driver.close();
    }
}
