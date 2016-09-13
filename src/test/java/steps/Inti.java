package steps;


import java.io.File;
import java.util.Properties;

import org.openqa.selenium.Platform;

import com.cognizant.framework.CraftDriver;
import com.cognizant.framework.ExecutionMode;
import com.cognizant.framework.FrameworkParameters;
import com.cognizant.framework.MobileExecutionPlatform;
import com.cognizant.framework.Settings;

import Runner.RunManager;
import cucumber.api.java.en.Given;
import supportLibraries.AppiumSetup;
import supportLibraries.DriverScript;

public class Inti {

    public RunManager runManager = new RunManager();
    //public static CraftDriver driver;
    @Given("^I initialize Appium driver$")
    public void i_initialize_Appium_driver() throws Throwable
    {
        //runManager.testRunner("Instance1", ExecutionMode.MOBILE, MobileExecutionPlatform.ANDROID,
        //   "5.0.2", Platform.MAC, "0a2bcb71");
        runManager.testRunner("Instance1", ExecutionMode.MOBILE, MobileExecutionPlatform.ANDROID,
                "6.0.1", Platform.LINUX, "HT59TBE00192");

    }

}