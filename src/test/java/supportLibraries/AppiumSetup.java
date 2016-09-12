package supportLibraries;

import java.io.File;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.cognizant.framework.ExecutionMode;
import com.cognizant.framework.FrameworkParameters;
import com.cognizant.framework.MobileExecutionPlatform;
import com.cognizant.framework.Settings;

import Runner.RunManager;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import junit.framework.TestCase;

public class AppiumSetup extends TestCase {

    public static AndroidDriver driver;
    //public static WebDriverWait waitVar = null;
	private FrameworkParameters frameworkParameters = FrameworkParameters.getInstance();
	public Properties mobileProperties;
	public RunManager runManager = new RunManager();

    public AppiumSetup(AndroidDriver driver2) throws Throwable {
		// TODO Auto-generated constructor stub
    	AppiumSetup.driver=driver2;
    	
	}
    public void initializeSettings()
    {
    	startUp();
    	initializeAppium();
    }
    public void initializeAppium() 
    {
    	 String instance = mobileProperties.getProperty("Instance");
    	 String executionMode = mobileProperties.getProperty("ExecutionMode");
    	 String mobileExecutionPlatform = mobileProperties.getProperty("MobileExecutionPlatform");
    	 String osVerison = mobileProperties.getProperty("OsVerison");
    	 String platform = mobileProperties.getProperty("Platform");
    	 String deviceName = mobileProperties.getProperty("DeviceName");
    	  runManager.testRunner(instance, ExecutionMode.MOBILE, MobileExecutionPlatform.ANDROID, 
		   osVerison, Platform.MAC, deviceName);


	}
	public void startUp() 
 	{
 		String relativePath = new File(System.getProperty("user.dir")).getAbsolutePath();
 		if (relativePath.contains("supportLibraries")) {
 			relativePath = new File(System.getProperty("user.dir")).getParent();
 		}
 		frameworkParameters.setRelativePath(relativePath);
 		mobileProperties = Settings.loadFromPropertiesFileForMobile();
 		
 	}
    
	public static void createDriver() throws Throwable {

        // set up appium
       // final File classpathRoot = new File(System.getProperty("/Users/mobilecoe/Desktop/BmiCalculator 2016-02-29 17-35-41"));
        //final File appDir = new File(classpathRoot, "/src/test/resources/apps");
        //final File app = new File(appDir, "BmiCalculator.ipa");

         DesiredCapabilities capabilities = new DesiredCapabilities();
        
       /* capabilities.setCapability(CapabilityType.BROWSER_NAME, "iOS");
    	
    	capabilities.setCapability("deviceName", "iPhone (3)");
     
    	capabilities.setCapability(CapabilityType.VERSION, "9.2");
    	 
    	capabilities.setCapability(CapabilityType.PLATFORM, "Mac");
    	
    	//capabilities.setCapability("udid", "7cf80568ddbcdb2b0e922acda61db6ec7879974e");
     
    	capabilities.setCapability("app", "/Users/qeatechnologycoe/Desktop/kasthuri/Cucumber apps/BmiCalculator 2016-02-29 17-35-41/BmiCalculator.ipa");
    	 
    	System.out.println("before @createdriver");

        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println("@create driver");*/
        //waitVar = new WebDriverWait(driver, 90);
         
       //----------Android-------
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
     	
    	capabilities.setCapability("deviceName", "05dcd2b2");
      
     	capabilities.setCapability(CapabilityType.VERSION, "4.4");
     	 
     	capabilities.setCapability(CapabilityType.PLATFORM, "Android");
     	
     	capabilities.setCapability("appPackage", "io.appium.android.apis");
     	
     	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
       
     	
     	//capabilities.setCapability("udid", "7cf80568ddbcdb2b0e922acda61db6ec7879974e");
      
     	//capabilities.setCapability("app", "/Users/qeatechnologycoe/Desktop/kasthuri/Cucumber apps/BmiCalculator 2016-02-29 17-35-41/BmiCalculator.ipa");
     	 
     //	capabilities.setCapability("appPackage", "com.sharebuilder.mobile");
    // 	capabilities.setCapability("appActivity", "com.sharebuilder.mobile.activities.PanelContentActivity");
     	

         
         
         
    }

     public static void teardown() throws Exception{
         //close the app
    	
         driver.quit();
     }
}