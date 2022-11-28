package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.HashMap;

public class HashMap1 {
    static  HashMap<String,String> login()
    {
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("x","admin@admin123");
        hm.put("y","admin");
        return hm;
    }

    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("");

         String cred =login().get("x");
         String arr[]=cred.split("@");

         driver.findElement(By.xpath("")).sendKeys(arr[0]);
        driver.findElement(By.xpath("")).sendKeys(arr[1]);}}
