package steps;

import Runner.RunManager;
import com.cognizant.framework.AppiumDriverFactory;
import com.cognizant.framework.CraftDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.*;
import supportLibraries.AppiumSetup;

/**
 * Created by dhandapani on 05/09/16.
 */
public class LoginSteps extends RunManager {



    //AppiumDriverFactory driver;
    //CraftDriver driver;
    LoginPage objLogin = new LoginPage(driver);
    OnboadingPage ObjOnboard = new OnboadingPage(driver);

    @Given("^I should see Myo(\\d+) Logo on the login page$")
    public void i_should_see_Myo_Logo_on_the_login_page(int arg1) throws Throwable {

    }



    @Given("^I should see \"(.*?)\" on the login page$")
    public void i_should_see_on_the_login_page(String information) throws Throwable {
        objLogin.verifyInformationOnTheLoginPage(information);
    }

    @Given("^I should see \"(.*?)\" link$")
    public void i_should_see_link(String link) throws Throwable {
        objLogin.verifyLink(link);
    }

    @Given("^I should see \"(.*?)\" link at bottom$")
    public void i_should_see_link_at_bottom(String link) throws Throwable {
        objLogin.verifyO2Gurus(link);
    }

    @Given("^I should see username field$")
    public void i_should_see_username_field() throws Throwable {

    }

    @Given("^I should see password field$")
    public void i_should_see_password_field() throws Throwable {

    }

    @Given("^I login to the app with \"(.*?)\"$")
    public void i_login_to_the_app_with(String username) throws Throwable {
        objLogin.enterTheUsername(username);

    }

    @Given("^I enter the password as \"(.*?)\"$")
    public void i_enter_the_password_as(String password) throws Throwable {
        objLogin.enterThePassword(password);
    }

    @Given("^I click login button$")
    public void i_click_login_button() throws Throwable {
        objLogin.verifyClickSubmit();
    }

    @Then("^I should enter the pin$")
    public void i_should_enter_the_pin() throws Throwable {
        objLogin.verifyPinPage();
    }

  @Then("^I should see fingerprint ID Page as following")
   public void i_should_see(DataTable fingerPrintInfo) throws Throwable {
      objLogin.verifyFingerPrintPage(fingerPrintInfo);
   }

   @Then("^I should click not now button$")
   public void i_should_click_not_now_button() throws Throwable {
       objLogin.verifyClickNotNowSubmit();
   }
    @Then("^I should see fingerprint ID Messages$")
    public void i_should_click_not_now_button(DataTable fingerPrintInfoMessage) throws Throwable {
        objLogin.verifyFingerPrintMessages(fingerPrintInfoMessage);
    }


    @Then("^I should click ok button$")
    public void i_should_click_ok_button() throws Throwable {
        objLogin.verifyClickOkButton();
    }

  @Then("^I should see Broadcast Message$")
   public void i_should_see_Broadcast_Message_OK_button(DataTable broadcastMessages) throws Throwable {
      objLogin.verifyBroadcastMessage(broadcastMessages);
  }
    @Then("^I should see home screen$")
   public void i_should_see_home_screen() throws Throwable {
        objLogin.verifyHomePage();
   }

    @Then("^I should signout$")
    public void I_should_signout() throws Throwable {
        objLogin.logouts();
    }


//    @Given("^I uninstall old app$")
//    public void i_Uninstall_Old_App() throws Throwable {
//        ObjOnboard.uninstallPackage();
//    }
//
//
//    @And("^I install new app$")
//    public void i_Install_New_App() throws Throwable {
//        ObjOnboard.installPackage();
//
//    }

}


