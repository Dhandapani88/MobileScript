package com.cognizant.framework;

import java.io.File;

/**
 * Singleton class that encapsulates Framework level global parameters
 * @author Cognizant
 */
public class FrameworkParameters {
	private String relativePath;
	private String runConfiguration;
	private boolean stopExecution = false;
	
	private static final FrameworkParameters FRAMEWORK_PARAMETERS =
													new FrameworkParameters();
	
	private FrameworkParameters() {
		// To prevent external instantiation of this class
	}
	
	/**
	 * Function to return the singleton instance of the {@link FrameworkParameters} object
	 * @return Instance of the {@link FrameworkParameters} object
	 */
	public static FrameworkParameters getInstance() {
		return FRAMEWORK_PARAMETERS;
	}
	
	/**
	 * Function to get the absolute path of the framework (to be used as a relative path)
	 * @return The absolute path of the framework
	 */
	public String getRelativePath() {
		return relativePath;
	}
	/**
	 * Function to set the absolute path of the framework (to be used as a relative path)
	 * @param relativePath The absolute path of the framework
	 */
	public void setRelativePath(String relativePath) {
		this.relativePath = relativePath;
	}

}