package com.stl.coupon.config;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SMSRequest {
	
	@NotBlank
	private String phoneNo;
	@NotBlank
	private String msg;
	@NotBlank
	private String module;
	
	public SMSRequest(
		@JsonProperty("phoneNo") String phoneNo, 
		@JsonProperty("msg") String msg, 
		@JsonProperty("module") String module) {
		
		this.phoneNo = phoneNo;
		this.msg = msg;
		this.module = module;
	}
	
	
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	
	

}
