package PageObjects;

import BasePage.Basepage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.ByteArrayInputStream;

public class AmazonLoginPages extends Basepage {



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

        WebElement emptycart =driver.findElement(By.xpath("//h2[normalize-space()='Your Amazon Cart is empty']"));
        System.out.println(">>>>>"+emptycart.getText());
//        driver.quit();
    }

    public static void clickOnSearchTextBar()
    {
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
    }




    public static void clickOnSearchBar(String product)
    {

        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(product);


    }

    public static void verifyResultPage()
    {
//        driver.findElement(By.xpath("(//span[normalize-space()=\"Results\"])[1]")).isDisplayed();

        WebElement result = driver.findElement(By.xpath("(//span[normalize-space()=\"Results\"])[1]"));
//        result.click();
        String text = result.getText();
        System.out.println(" >>>>>>> "+ text);


    }



}
