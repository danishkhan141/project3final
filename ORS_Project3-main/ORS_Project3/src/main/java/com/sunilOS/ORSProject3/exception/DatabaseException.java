package com.sunilOS.ORSProject3.exception;


public class DatabaseException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param msg
	 * error message
	 */
	public DatabaseException(String msg){
		super(msg);
	}

}
