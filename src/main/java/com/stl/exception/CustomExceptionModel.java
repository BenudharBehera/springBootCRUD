package com.stl.exception;

import java.util.Date;

public class CustomExceptionModel {

	private Date timeStamp;
	private String message;
	private String details;
	
	public CustomExceptionModel(Date timeStamp, String message, String details) {		
		this.timeStamp = timeStamp;
		this.message = message;
		this.details = details;		
	}
	
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	@Override
	public String toString() {
		return String.format("CustomExceptionModel [timeStamp=%s, message=%s, details=%s]", timeStamp, message,
				details);
	}
	
	
	
}
