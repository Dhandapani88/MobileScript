package Runner;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.Platform;

import com.cognizant.framework.CraftDriver;
import com.cognizant.framework.ExecutionMode;
import com.cognizant.framework.MobileExecutionPlatform;
import com.cognizant.framework.SeleniumTestParameters;
import com.cognizant.framework.Settings;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;
import supportLibraries.DriverScript;
import java.util.Properties;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@ExtendedCucumberOptions(
//jsonReport="build/Testmunk/cucumber.json",
//jsonUsageReport = "build/Testmunk/cucumber-usage.json",
//outputFolder = "build/Testmunk/",
//detailedReport = true,
//detailedAggregatedReport = true,
//overviewReport = true,
//usageReport = false,
//coverageReport = false
//)

/*@CucumberOptions (features = RunManager.x,
glue = "stepDefinitions",
plugin = {"html:build/Testmunk/cucumber-html-report",
"junit:build/Testmunk/cucumber-junit.xml",
"json:build/Testmunk/cucumber.json",
"pretty:build/Testmunk/cucumber-pretty.txt",
"usage:build/Testmunk/cucumber-usage.json"},
monochrome = true)

*/
@Cucumber.Options(features = RunManager.x,glue="steps",tags="@devDone",monochrome = true)

//"src/features/eribankFeature.feature"
//"src/features/"+RunManager.featureName
public class RunManager {

		
	//public static final String x="src/features/eribankFeature.feature";
	public static final String x="/home/dhandapani/Dhandapani/mymobile_ws/MobileScript/src/test/java/features/Login.feature";
	public static CraftDriver driver;

	//public static final String featureName = Settings.loadFromPropertiesFileForMobile().getProperty("FeatureName");
	public void testRunner(String testInstance, 
			ExecutionMode executionMode,
			MobileExecutionPlatform mobileExecutionPlatform,
			String mobileOsVersion,
			Platform platform,
			String deviceName) {
		SeleniumTestParameters testParameters = new SeleniumTestParameters();	
		testParameters.setExecutionMode(executionMode);
		testParameters.setMobileExecutionPlatform(mobileExecutionPlatform);
		testParameters.setPlatform(platform);
		testParameters.setDeviceName(deviceName);
		testParameters.setmobileOSVersion(mobileOsVersion);
		testParameters.setCurrentTestInstance(testInstance);
		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();
		//driverScript.relativePath();
		//mobileProperties = Settings.loadFromPropertiesFileForMobile();
		//featureName = mobileProperties.getProperty("FeatureName");
		//System.out.println("feature Name:"+featureName);
		//tearDownTestRunner(testParameters, driverScript);
	}
	public void setCraftDriver(CraftDriver driver)
	{
		this.driver = driver;
	}

}
