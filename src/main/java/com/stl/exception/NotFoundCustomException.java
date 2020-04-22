package com.stl.exception;

public class NotFoundCustomException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	public NotFoundCustomException(String message) {
		super(message);
	}	
}
