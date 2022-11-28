package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class uploadfileusingSikuli {
    public static void main(String [] args) throws FindFailed {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();


        //first method
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

        Actions act  = new Actions(driver);

         WebElement element = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div[2]/input"));

         act.doubleClick(element).build().perform();


        String imageLocation = "C:\\Users\\DELL\\Desktop\\sikuli\\files\\";
        String inputLocation = "C:\\Users\\DELL\\Desktop\\sikuli\\";

        Screen s = new Screen();

        Pattern fileInputField = new Pattern(imageLocation +"file.PNG");
        Pattern openButton = new Pattern(imageLocation +"open.PNG");


        s.wait(fileInputField,20);
        s.type(fileInputField,inputLocation+"Trip_confirm_modal");
        s.click(openButton);
        s.type(fileInputField,inputLocation+"Trip_confirm_modal");
        s.click(openButton);

    }
}
