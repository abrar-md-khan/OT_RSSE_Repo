package com.opentext.platform;

import java.util.Locale;
import java.util.ResourceBundle;

public abstract class ErrorBundleResource {

	private static ResourceBundle resourceManager = ResourceBundle
			.getBundle(ErrorBundleResource.class.getName(), Locale.getDefault());

	public ErrorBundleResource() {
		//Loads the error bundle resource object.
	}

	/**
	 * 
	 * @return
	 */
	public static String sendInvalidUserId() {
		return resourceManager.getString("sendInvalidUserId");
	}

	/**
	 * 
	 */
	public static String getAuthenticateUsingExtendedCredentialsFailed() {
		return resourceManager.getString("getAuthenticateUsingExtendedCredentialsFailed");
	}

	/**
	 * 
	 */
	public static String getInvalidTicket() {
		return resourceManager.getString("getInvalidTicket");
	}

	/**
	 * 
	 */
	public static String getAuthenticateUsingPasswordFailed() {
		return resourceManager.getString("getAuthenticateUsingPasswordFailed");
	}

}