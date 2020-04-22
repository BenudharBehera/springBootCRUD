package com.stl.coupon.dto;

public class StatusResponse extends AbstractResponse {
	
	private int status;
	private String statusDesc;
		
	public StatusResponse(int status, String statusDesc) {
		super();
		this.status = status;
		this.statusDesc = statusDesc;
	}
	
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getStatusDesc() {
		return statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}
	
	

}
