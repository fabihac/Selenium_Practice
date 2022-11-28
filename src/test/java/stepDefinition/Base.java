package stepDefinition;

import PageObjectModel.RegistrationPage;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;


public class Base {
    public WebDriver driver;
    public RegistrationPage rp;

    public  static Logger logger;



    public static String random(){
        String generatedString = RandomStringUtils.randomAlphabetic(5);
        return (generatedString);
    }
}
