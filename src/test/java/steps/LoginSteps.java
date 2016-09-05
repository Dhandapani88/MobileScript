package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by dhandapani on 05/09/16.
 */
public class LoginSteps {


    WebDriver driver = new FirefoxDriver();

    @Given("^the user is on login page$")
    public void setup() throws Throwable {
        driver.get("http://mymobile.o2.co.uk");
        driver.manage().window().maximize();
    }


    @And("^she enter user name as ([^\"]*)$")
    public void she_provides_the_first_name_as(String firstName) throws Throwable {
        driver.findElement(By.id("user_first_name")).sendKeys(firstName);
    }


    @And("^she enter pwd as ([^\"]*)$")
    public void she_provides_the_last_name_as(String lastName) throws Throwable {
        driver.findElement(By.id("user_last_name")).sendKeys(lastName);
    }



    @And("^she click login button$")
    public void she_signs_up() throws Throwable {
        driver.findElement(By.name("commit")).click();
    }

    @Then("^she should be login in to the application$")
    public void she_should_be_logged_in_to_the_application() throws Throwable {
        boolean signOutLinkDisplayed = driver.findElement(By.cssSelector("a[href='/users/sign_out']")).isDisplayed();
        Assert.assertTrue(signOutLinkDisplayed);
    }


}
