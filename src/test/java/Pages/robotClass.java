package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;

import java.awt.*;
import java.awt.event.KeyEvent;

public class robotClass {
    public static void main(String [] args) throws FindFailed, AWTException {

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        //first method
        driver.get("https://www.vertex42.com/ExcelTemplates/yearly-calendar.html");

        driver.findElement(By.xpath("//div[1]/div/p[7]/a")).click();

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);

    }
}
