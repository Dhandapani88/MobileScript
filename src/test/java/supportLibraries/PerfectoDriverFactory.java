package supportLibraries;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import junit.framework.TestCase;

public class PerfectoDriverFactory extends TestCase {

    public static AndroidDriver driver;
    //public static WebDriverWait waitVar = null;

    public PerfectoDriverFactory(AndroidDriver driver2) throws Throwable {
		// TODO Auto-generated constructor stub
    	PerfectoDriverFactory.driver=driver2;
    	
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
       // capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
     	
    	capabilities.setCapability("deviceName", "0186CD5D58C64EC8");
      
     //	capabilities.setCapability(CapabilityType.VERSION, "4.4");
     	 
     	capabilities.setCapability(CapabilityType.PLATFORM, "Android");
     	
     //	capabilities.setCapability("appPackage", "io.appium.android.apis");
     	capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
     	capabilities.setCapability("user","muruganantham.A@cognizant.com");
     	capabilities.setCapability("password","password-1");
     	driver = new AndroidDriver(new URL("https://mobiletestlab.cognizant.com/nexperience/perfectomobile/wd/hub"), capabilities);
       
     	
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