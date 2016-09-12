package supportLibraries;

import java.io.File;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.cognizant.framework.SeleniumTestParameters;
import com.cognizant.framework.Settings;
import com.cognizant.framework.AppiumDriverFactory;
import com.cognizant.framework.CraftDriver;
import com.cognizant.framework.FrameworkException;
import com.cognizant.framework.FrameworkParameters;

import Runner.RunManager;

public class DriverScript {
	private SeleniumTestParameters testParameters;
	public static Properties properties;
	private static Properties mobileProperties;
	private CraftDriver driver;
	public RunManager runManager = new RunManager();
	private FrameworkParameters frameworkParameters = FrameworkParameters.getInstance();
	public DriverScript(SeleniumTestParameters testParameters) {
		this.testParameters = testParameters;
	}
	public void driveTestExecution() 
	{
		startUp();
		initializeWebDriver();
		craftDriverInitialization();
	}
	
	public void startUp() 
	{
		relativePath();		
		mobileProperties = Settings.loadFromPropertiesFileForMobile();
	}
	
	public void relativePath()
	{
		String relativePath = new File(System.getProperty("user.dir")).getAbsolutePath();
		if (relativePath.contains("supportLibraries")) 
		{
			relativePath = new File(System.getProperty("user.dir")).getParent();
		}
		frameworkParameters.setRelativePath(relativePath);
	}
	
	public void initializeWebDriver() 
	{
		// TODO Auto-generated method stub
		switch(testParameters.getExecutionMode()) 
		{
			case MOBILE:
				System.out.println("INSIDE CASE:MOBILE");
				WebDriver appiumDriver = AppiumDriverFactory.getAppiumDriver(
						testParameters.getMobileExecutionPlatform(),
						testParameters.getDeviceName(),
						testParameters.getMobileOSVersion(),
						testParameters.shouldInstallApplication(),
						mobileProperties.getProperty("AppiumURL")
						);
				driver = new CraftDriver(appiumDriver);
				driver.setTestParameters(testParameters);
			
			case PERFECTO:
				//yet to implement
				break;
		default:
			throw new FrameworkException("Unhandled Execution Mode!");
		}
		
	}
	
	public void craftDriverInitialization()
	{
		runManager.setCraftDriver(driver);
	}

}
