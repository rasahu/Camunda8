package com.example.workflow.Exception;

public class ProcessNotStartedException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProcessNotStartedException(String key ) {
		super("Process Not Started for Key ::  "+key +" Please Check the key Or Contact the Admin");
	}

}
