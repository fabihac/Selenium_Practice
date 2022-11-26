package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;

public class encodedPass {
    public static void main(String [] args) throws FindFailed {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();


        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='eid']/input")).sendKeys("fabiha");
        String str ="RmFiaWhhX01hcnphbl9DaG93ZGh1cnk=";
        driver.findElement(By.xpath("//*[@id='firstpassword']")).sendKeys(decode(str));


    }
    static String decode(String pass){
        byte[] decode = Base64.decodeBase64(pass);
        return (new String(decode));



    }
}
