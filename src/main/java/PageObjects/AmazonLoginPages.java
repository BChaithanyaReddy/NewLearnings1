package PageObjects;

import BasePage.Basepage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.ByteArrayInputStream;

public class AmazonLoginPages extends Basepage {

//    static WebDriver driver;


    public static void LaunchURL()
    {
//        System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--remote-allow-origins=*");
//        driver = new ChromeDriver(chromeOptions);
//        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
    }

    public static void clickCart()
    {
        driver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();
    }


    public static void verifyCartContent()
    {

        WebElement emptycart =driver.findElement(By.xpath("//h2[normalize-space()='Your Amazon Cart is empt']"));
        System.out.println(">>>>>"+emptycart.getText());
        driver.quit();
    }

}
