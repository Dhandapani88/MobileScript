package com.cognizant.framework;

import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Enumeration to represent the mode of execution
 * @author Cognizant
 */
public enum ExecutionMode {
	
	/**
	 * Execute on a Perfecto MobileCloud device using {@link RemoteWebDriver}
	 */
	PERFECTO,
	
	/**
	 * Execute on a mobile device using Appium
	 */
	MOBILE,
	/**
	 * Execute on a mobile device using SeeTest
	 */
	SEETEST,
	/**
	 * Execute on a mobile device using MobileLabs
	 */
	MOBILELABS;

}