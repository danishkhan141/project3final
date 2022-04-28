package com.sunilOS.ORSProject3.exception;


public class RecordNotFoundException extends Exception{

	
	private static final long serialVersionUID = 1L;

	/**
	 * @param msg
	 *      : Error message
	 */
	public RecordNotFoundException(String msg){
		
		super(msg);
	}
}
