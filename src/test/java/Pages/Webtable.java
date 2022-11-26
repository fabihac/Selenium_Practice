package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable{
    static WebDriver driver;

    public static void main (String [] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        //findling all the table data size(row)
        int r = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr")).size();
        System.out.println(r);

        //findling all the table data size(column)
        int c = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr/th")).size();
        System.out.println(c);

        //printing value
        for (int i = 2; i<=r;i++){ //counting row
            for (int j=1; j<=c ; j++){ //counting column
                System.out.print(driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText()+" "); //printing data
            }
            System.out.println();
        }
    }
}
