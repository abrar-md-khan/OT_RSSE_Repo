package com.opentext.rsse.exceptions;

import org.apache.axis2.AxisFault;

/**
 * Class for handling the exceptions in RSSE plugin
 * 
 * @author skasyap
 */
public class RSSEException extends AxisFault
{
	private static final long serialVersionUID = -6730449859233680914L;

	/**
	 * Initializes a new instance of the RSSEException class with a specified message.
	 * 
	 * @param message
	 *          The exception message.
	 */
	public RSSEException(String message)
	{
		super(message);
	}

	/**
	 * Initializes a new instance of the RSSEException class with a specified error message and a reference to the inner
	 * exception that is the cause of this exception.
	 * 
	 * @param message
	 *          The error message that explains the reason for the exception.
	 * @param innerException
	 *          The exception that is the cause of the current exception.
	 */
	public RSSEException(String message, Throwable cause)
	{
		super(message, cause);
	}
}
