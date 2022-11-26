package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;

import java.util.Set;

public class cookiesHandling {

    public static void main(String [] args) throws FindFailed {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();


        //first method
        driver.get("https://www.amazon.com/");
        Set <Cookie> cookies = driver.manage().getCookies();//capture all the cookies
        System.out.println("Size of cookies "+cookies.size());

        for (Cookie i:cookies)//printing all the cookies
        {
            System.out.println(i.getName()+" : "+i.getValue());
        }

        //adding cookie
        Cookie objCookie = new Cookie("myCookie","123456789");
        driver.manage().addCookie(objCookie);
        cookies = driver.manage().getCookies();
        System.out.println("Size of cookies "+cookies.size());
        for (Cookie i:cookies)//printing all the cookies
        {
            System.out.println(i.getName()+" : "+i.getValue());
        }
        //delete cookie
        driver.manage().deleteCookie(objCookie);
        cookies = driver.manage().getCookies();
        System.out.println("Size of cookies "+cookies.size());
        for (Cookie i:cookies)//printing all the cookies
        {
            System.out.println(i.getName()+" : "+i.getValue());
        }

        driver.close();
        driver.quit();
    }
}
