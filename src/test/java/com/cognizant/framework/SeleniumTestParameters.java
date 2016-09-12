package com.cognizant.framework;



import org.openqa.selenium.Platform;

/**
 * Class to encapsulate various input parameters required for each test script
 * 
 * @author Cognizant
 */
public class SeleniumTestParameters {
	private String currentTestInstance;
	private ExecutionMode executionMode;
	private Platform platform;
	private String deviceName;
	private String perfectoDeviceId;
	private boolean installApplication;
	private MobileExecutionPlatform mobileExecutionPlatform;
	
	private String mobileOsVersion;
	/**
	 * Function to get the current test instance
	 * @return The current test instance
	 */
	public String getCurrentTestInstance() {
		return currentTestInstance;
	}
	
	/**
	 * Function to set the current test instance
	 * @param currentTestInstance The current test instance
	 */
	public void setCurrentTestInstance(String currentTestInstance) {
		this.currentTestInstance = currentTestInstance;
	}

	/**
	 * Function to get the {@link ExecutionMode} for the test being executed
	 * 
	 * @return The {@link ExecutionMode} for the test being executed
	 */
	public ExecutionMode getExecutionMode() {
		return executionMode;
	}

	/**
	 * Function to set the {@link ExecutionMode} for the test being executed
	 * 
	 * @param executionMode
	 *            The {@link ExecutionMode} for the test being executed
	 */
	public void setExecutionMode(ExecutionMode executionMode) {
		this.executionMode = executionMode;
	}

	/**
	 * Function to get the {@link MobileExecutionPlatform} for the test being
	 * executed
	 * 
	 * @return The {@link MobileExecutionPlatform} for the test being executed
	 */
	public MobileExecutionPlatform getMobileExecutionPlatform() {
		return mobileExecutionPlatform;
	}

	/**
	 * Function to set the {@link MobileExecutionPlatform} for the test being
	 * executed
	 * 
	 * @param executionPlatform
	 *            The {@link MobileExecutionPlatform} for the test being
	 *            executed
	 */
	public void setMobileExecutionPlatform(
			MobileExecutionPlatform mobileExecutionPlatform) {
		this.mobileExecutionPlatform = mobileExecutionPlatform;
	}


	/**
	 * Function to get a Boolean value indicating whether to install application
	 * in Device
	 * 
	 * @return Boolean value indicating whether to install Application in device
	 */
	public boolean shouldInstallApplication() {
		return installApplication;
	}

	/**
	 * Function to set a Boolean value indicating whether to install application
	 * in Device
	 * 
	 * @param generateExcelReports
	 *            Boolean value indicating whether to install application in
	 *            Device
	 */
	public void setInstallApplication(boolean installApplication) {
		this.installApplication = installApplication;
	}

	/**
	 * Function to get the OS Version of device on which the test is to be
	 * executed
	 * 
	 * @return The OS Version of device Version on which the test is to be
	 *         executed
	 */
	public String getMobileOSVersion() {
		return mobileOsVersion;
	}

	/**
	 * Function to set the OS Version of device Version on which the test is to
	 * be executed
	 * 
	 * @param version
	 *            The OS Version of device Version on which the test is to be
	 *            executed
	 */
	public void setmobileOSVersion(String mobileOsVersion) {
		this.mobileOsVersion = mobileOsVersion;
	}

	/**
	 * Function to get the {@link Platform} on which the test is to be executed
	 * 
	 * @return The {@link Platform} on which the test is to be executed
	 */
	public Platform getPlatform() {
		return platform;
	}

	/**
	 * Function to set the {@link Platform} on which the test is to be executed
	 * 
	 * @param platform
	 *            The {@link Platform} on which the test is to be executed
	 */
	public void setPlatform(Platform platform) {
		this.platform = platform;
	}

	/**
	 * Function to get the name of the mobile device on which the test is to be
	 * executed
	 * 
	 * @return The name of the mobile device on which the test is to be executed
	 */
	public String getDeviceName() {
		return deviceName;
	}

	/**
	 * Function to set the name of the mobile device on which the test is to be
	 * executed<br>
	 * <br>
	 * If the ExecutionMode is PERFECTO_REMOTEWEBDRIVER, this function also sets
	 * the device's Perfecto MobileCloud ID, by accessing the Perfecto Device
	 * List within the Global Settings.properties file
	 * 
	 * @param deviceName
	 *            The name of the mobile device on which the test is to be
	 *            executed
	 */
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;

		if (ExecutionMode.PERFECTO.equals(this.executionMode)) {
			// Properties properties = Settings.getInstance();
			this.perfectoDeviceId = this.deviceName;
		}
	}

	/**
	 * Function to get the ID of the Perfecto MobileCloud device on which the
	 * test is to be executed
	 * 
	 * @return The ID of the Perfecto MobileCloud device on which the test is to
	 *         be executed
	 */
	public String getPerfectoDeviceId() {
		return perfectoDeviceId;
	}

	/**
	 * Function to set the ID of the Perfecto MobileCloud device on which the
	 * test is to be executed
	 * 
	 * @param perfectoDeviceId
	 *            The ID of the Perfecto MobileCloud device on which the test is
	 *            to be executed
	 */
	public void setPerfectoDeviceId(String perfectoDeviceId) {
		this.perfectoDeviceId = perfectoDeviceId;
	}

}