package com.example.workflow.model;

import lombok.Data;

@Data
public class GeneralResponse {
	private int statusCode;
	private String message;

	public GeneralResponse(int statusCode, String message) {
		this.statusCode = statusCode;
		this.message = message;
	}
	
}
