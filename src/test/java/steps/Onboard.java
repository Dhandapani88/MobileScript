package steps;

import Runner.RunManager;
import com.cognizant.framework.AppiumDriverFactory;
import com.cognizant.framework.CraftDriver;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.springframework.beans.factory.annotation.Autowired;
import pages.*;
import supportLibraries.AppiumSetup;

/**
 * Created by dhandapani on 05/09/16.
 */


public class Onboard extends RunManager {


    //AppiumDriverFactory driver;
    //CraftDriver driver;

    @Autowired
    private OnboadingPage ObjOnboard;

    public Onboard() {
        ObjOnboard = new OnboadingPage(driver);
    }


    @Given("^I uninstall old app$")
    public void i_Uninstall_Old_App() throws InterruptedException {
        ObjOnboard.uninstallPackage();
    }


    @Then("^I install new app$")
    public void i_Install_New_App() throws InterruptedException {
        ObjOnboard.installPackage();

    }
}


