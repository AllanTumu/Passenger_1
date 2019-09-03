package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginScript {

    AndroidDriver driver;

    @Given("^I launch the Passenger App$")
    public void i_launch_the_Passenger_App() throws MalformedURLException {
        // Write code here that turns the phrase above into concrete actions
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"H806W30123456789");
        dc.setCapability("platformName","android");
        dc.setCapability("appPackage","com.safeboda.passenger");
        dc.setCapability("appActivity","com.safeboda.presentation.ui.splash.StartActivity");
        dc.setCapability("automationName ","auiautomator2");
        dc.setCapability("appWaitActivity ","20000");
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);

    }

    @When("^I tap on continue with mobile Number$")
    public void i_tap_on_continue_with_mobile_Number()  {
        // Write code here that turns the phrase above into concrete actions
        MobileElement el1 = (MobileElement) driver.findElementById("com.safeboda.passenger:id/loginBtn");
        el1.click();
    }

    @Then("^I see a screen to Register/logIn$")
    public void i_see_a_screen_to_Register_logIn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        MobileElement el4 = (MobileElement) driver.findElementById("com.safeboda.passenger:id/phoneEditText");
        el4.click();
        el4.sendKeys("787764974");
        throw new PendingException();
    }

    @Then("^Enter the mobile number \"([^\"]*)\"$")
    public void enter_the_mobile_number(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I tap the Continue button$")
    public void i_tap_the_Continue_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        MobileElement el5 = (MobileElement) driver.findElementById("com.safeboda.passenger:id/continueBtn");
        el5.click();
        Thread.sleep(11000);
        throw new PendingException();
    }

    @When("^proceed to the next screen$")
    public void proceed_to_the_next_screen() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(driver.findElementsByLinkText("Verify Number"),"Verify Number");
        throw new PendingException();
    }

    @Then("^I wait for the Verification code$")
    public void i_wait_for_the_Verification_code() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(15000);
        throw new PendingException();
    }

    @When("^I tap Verify Button$")
    public void i_tap_Verify_Button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        MobileElement el6 = (MobileElement) driver.findElementById("com.safeboda.passenger:id/verifyBtn");
        el6.click();
        if (driver.findElementById("com.safeboda.passenger:id/okPermissionAndGpsBtn").isDisplayed()){
            MobileElement el7 = (MobileElement) driver.findElementById("com.safeboda.passenger:id/okPermissionAndGpsBtn");
            el7.click();
        }
        else return;
        throw new PendingException();
    }

    @Then("^User successfully logs in$")
    public void user_successfully_logs_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        org.testng.Assert.assertEquals(driver.findElementById("com.safeboda.passenger:id/myBalanceTxtView").getText(),"My Balance:");
        throw new PendingException();
    }

}
