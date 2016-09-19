//package steps;
//
//import Runner.RunManager;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import pages.OnboadingPage;
//
//import static org.testng.Assert.*;
//
///**
// * Created by dhandapani on 18/09/16.
// */
//public class OnboardTest extends RunManager {
//
//    OnboadingPage objOnboard = new OnboadingPage(driver);
//
//
//
//    @Given("^I uninstall old app$")
//    public void i_Uninstall_Old_App() throws Throwable {
//        objOnboard.uninstallPackage();
//    }
//
//
//    @And("^I install new app$")
//    public void i_Install_New_App() throws Throwable {
//        objOnboard.installPackage();
//
//    }
//}
