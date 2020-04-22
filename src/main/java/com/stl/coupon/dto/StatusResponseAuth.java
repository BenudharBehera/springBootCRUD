package com.stl.coupon.dto;

public class StatusResponseAuth extends AbstractResponseAuth{
	
	private int status;
	private String statusDesc;
	private String link ;
	
	public StatusResponseAuth(int status, String statusDesc, String link) {
		super();
		this.status = status;
		this.statusDesc = statusDesc;
		this.link = link;
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
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
	@Override
	public String toString() {
		return String.format("StatusResponseAuth [status=%s, statusDesc=%s, link=%s]", status, statusDesc, link);
	}
	
	
	

}
