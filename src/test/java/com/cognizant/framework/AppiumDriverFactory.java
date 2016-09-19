package com.cognizant.framework;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AppiumDriverFactory {

	private static Properties mobileProperties;

	public AppiumDriverFactory() {
		// To prevent external instantiation of this class
	}

	@SuppressWarnings("unused")
	public static String getAppProperties() {
		mobileProperties = Settings.getMobilePropertiesInstance();

		String appPack = mobileProperties.getProperty("Application_Package_Name");
		return appPack;
	}

	public static String getDeviceProperties() {
		mobileProperties = Settings.getMobilePropertiesInstance();

		String deviceName = mobileProperties.getProperty("DeviceName");
		return deviceName;
	}

	public static String getAPKProperties() {
		mobileProperties = Settings.getMobilePropertiesInstance();

		String apkName = mobileProperties.getProperty("Application_Path");
		return apkName;
	}




	@SuppressWarnings("rawtypes")
	public static AppiumDriver getAppiumDriver(
			MobileExecutionPlatform executionPlatform, String deviceName,
			String version, Boolean installApp, String appiumURL) {

		AppiumDriver driver = null;
		mobileProperties = Settings.loadFromPropertiesFileForMobile();
		String appPath = installApplication(false);
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		try {
			
			switch (executionPlatform) {

			case ANDROID:
				System.out.println("Inside Case:ANDROID");
				desiredCapabilities.setCapability("platformName", "Android");
				desiredCapabilities.setCapability("deviceName", deviceName);
				desiredCapabilities.setCapability("udid",deviceName);
				desiredCapabilities.setCapability("platformVersion", version);
				//desiredCapabilities.setCapability("app", appPath);
				//desiredCapabilities.setCapability("appPackage","com.experitest.ExperiBank");
				//desiredCapabilities.setCapability("appActivity","com.experitest.ExperiBank.LoginActivity");
				
				desiredCapabilities.setCapability("appPackage",
						mobileProperties.getProperty("Application_Package_Name"));
				desiredCapabilities.setCapability("appActivity", mobileProperties.getProperty("Application_MainActivity_Name"));
				try {
					driver = new AndroidDriver(new URL(appiumURL),
							desiredCapabilities);					
				} catch (MalformedURLException e) {
					e.printStackTrace();
					throw new FrameworkException(
							"The android driver invokation has problem, please re-check the capabilities or Start Appium");
				}
				break;

			case IOS:

				desiredCapabilities.setCapability("platformName", "ios");
				desiredCapabilities.setCapability("platformVersion", version);
				desiredCapabilities.setCapability("deviceName", deviceName);
				// desiredCapabilities.setCapability("udid",deviceName);
			desiredCapabilities.setCapability("app",mobileProperties.getProperty("iPhoneApplicationPath"));
				desiredCapabilities.setCapability("bundleId", mobileProperties.getProperty("iPhoneBundleID"));
				desiredCapabilities.setCapability("newCommandTimeout", 120);
				try {
					driver = new IOSDriver(new URL(appiumURL),
							desiredCapabilities);
					
					System.out.println("~~~~~~INSIDE AppiumDriverFactory-Case iOS");
					
					//driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).sendKeys("156");

				} catch (MalformedURLException e) {
					e.printStackTrace();
					throw new FrameworkException(
							"The IOS driver invokation has problem, please re-check the capabilities or Start Appium");
				}
				break;

			default:
				throw new FrameworkException("Unhandled ExecutionMode!");
			
			}
			//ApiDemoSteps.driverAndroid(driver);

		} catch (Exception ex) {
			throw new FrameworkException(
					"The appium driver invocation created a problem , please check the capabilities");
		
		}

		return driver;

	}

	private static String installApplication(Boolean installApp) {
		String appPath = "";

		try {
			if (installApp) {
				File path = new File(
						mobileProperties.getProperty("AndroidApplicationPath"));
				appPath = path.getAbsolutePath();
			}
		} catch (Exception ex) {

			throw new FrameworkException(
					"Please check the Android Application Path in Global Setting.Properties");
		
			}
		return appPath;
	}
}
