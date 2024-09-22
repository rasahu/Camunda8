package com.example.workflow.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.example.workflow.model.GeneralResponse;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<GeneralResponse> handleProductNotFoundException(StudentNotFoundException ex) {
		GeneralResponse generalResponse = new GeneralResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(generalResponse);
	}

	@ExceptionHandler(ProcessNotFoundException.class)
	public ResponseEntity<GeneralResponse> handleProcessNotFoundException(ProcessNotFoundException ex) {
		GeneralResponse generalResponse = new GeneralResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(generalResponse);
	}
	@ExceptionHandler(ProcessNotStartedException.class)
	public ResponseEntity<GeneralResponse> handleProcessNotFoundException(ProcessNotStartedException ex) {
		GeneralResponse generalResponse = new GeneralResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(generalResponse);
	}
}
