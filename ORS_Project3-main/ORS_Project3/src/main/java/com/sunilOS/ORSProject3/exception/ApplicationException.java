package com.sunilOS.ORSProject3.exception;



public class ApplicationException extends Exception{

	
	private static final long serialVersionUID = 1L;

	
	/**
	 * @param msg
	 *      : Error message
	 */
	public ApplicationException(String msg) {
		super(msg);
	}
}
