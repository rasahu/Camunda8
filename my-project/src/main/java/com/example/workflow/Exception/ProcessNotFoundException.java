package com.example.workflow.Exception;

public class ProcessNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ProcessNotFoundException(String processKey) {
		super("Process not found  :: "+processKey);
	}

}
