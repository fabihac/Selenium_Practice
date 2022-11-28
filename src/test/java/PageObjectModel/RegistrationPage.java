package PageObjectModel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegistrationPage {
    public WebDriver driver;



    public RegistrationPage(WebDriver rdriver)
    {
        driver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy( xpath = "//*[@id='basicBootstrapForm']/div[1]/div[1]/input")
    @CacheLookup
    WebElement firstName;

    @FindBy( xpath = "//*[@id='basicBootstrapForm']/div[1]/div[2]/input")
    @CacheLookup
    WebElement lastName;

    @FindBy( id = "submitbtn")
    @CacheLookup
    WebElement submitButton;
    @FindBy( xpath = "//*[@id='eid']/input")
    @CacheLookup
    WebElement validationMassage;






    public void setFirstName(String fName)
    {
        firstName.clear();
        firstName.sendKeys(fName);
    }
    public  void setLastName(String lName)
    {
        lastName.clear();
        lastName.sendKeys(lName);
    }
    public void clickButton()
    {
        submitButton.sendKeys(Keys.RETURN);
    }
    public  String validationMassage()
    {
       String massage = validationMassage.getAttribute("ValidationMassage");
        return (massage);
    }


}


