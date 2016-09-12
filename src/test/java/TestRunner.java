/**
 * Created by dhandapani on 12/09/16.
 */
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.Platform;

import com.cognizant.framework.ExecutionMode;
import com.cognizant.framework.MobileExecutionPlatform;
import com.cognizant.framework.SeleniumTestParameters;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;
import supportLibraries.DriverScript;


@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(
//jsonReport = TestRunner.reportPath+"/cucumber.json",
        jsonUsageReport = "build/APIDemos/cucumber-usage.json",
        outputFolder = "build/APIDemos/",
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        usageReport = false,
        coverageReport = false
//screenShotLocation = "build/APIDemos/screenshots/",
//screenShotSize = "300px",
//toPDF = false
)

/*
@CucumberOptions (features = {"src/features/GoogleLaunch.feature","src/features/GoogleSearch.feature"},
        tags = {"@"},
        glue = "stepDefinitions.Google",
        plugin = {"html:build/APIDemos/cucumber-html-report",
                "junit:build/APIDemos/cucumber-junit.xml",
                "json:build/APIDemos/cucumber.json",
               "pretty:build/APIDemos/cucumber-pretty.txt",
                "usage:build/APIDemos/cucumber-usage.json"},
        monochrome = true)
*/

@Cucumber.Options(features="src/test/resources/features",glue="uk/co/o2/myo2middleware/test/steps",tags="@devDone")
public class TestRunner
{
    public void testRunner(String testInstance,
                           ExecutionMode executionMode,
                           MobileExecutionPlatform mobileExecutionPlatform,
                           String mobileOsVersion,
                           Platform platform,
                           String deviceName) {
        SeleniumTestParameters testParameters = new SeleniumTestParameters();

        testParameters.setExecutionMode(executionMode);
        testParameters.setPlatform(platform);
        testParameters.setCurrentTestInstance(testInstance);
        DriverScript driverScript = new DriverScript(testParameters);
        driverScript.driveTestExecution();

        //tearDownTestRunner(testParameters, driverScript);
    }

}

/*@CucumberOptions (features = "src/features/BmiCalc.feature",   plugin = {
		"pretty",
		"html:target/SB/",


        }, monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests
{

}


*/



//"json:target/BMI/cucumber.json"



//"usage:target/cucumber-usage.json",