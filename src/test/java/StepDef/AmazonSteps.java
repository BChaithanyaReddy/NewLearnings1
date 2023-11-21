package StepDef;

import BasePage.Basepage;
import PageObjects.AmazonLoginPages;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.ByteArrayInputStream;



public class AmazonSteps extends Basepage{


    @Given("I am on Amazon application")
    public void iAmOnAmazonApplication() {
        Basepage.SetDriver();
        AmazonLoginPages.LaunchURL();
    }

    @When("I move to cart")
    public void iMoveToCart() {
        AmazonLoginPages.clickCart();
    }

    @Then("User should see You cart is empty")
    public void userShouldSeeYouCartIsEmpty() {
        AmazonLoginPages.verifyCartContent();
    }

    @AfterStep
    public static void verifyCartContent1(Scenario scenario)
    {
        if (!scenario.isFailed())
        {
            byte[] screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Passed Screenshot", new ByteArrayInputStream(screenshot));
        }

        if (scenario.isFailed())
        {
            byte[] screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Failed Screenshot", new ByteArrayInputStream(screenshot));
        }

    }

}
