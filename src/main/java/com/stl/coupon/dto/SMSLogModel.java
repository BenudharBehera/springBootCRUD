package com.stl.coupon.dto;

public class SMSLogModel {
	
	private long id;
	private long smsContectId;
	private String userId;
	private long count;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getSmsContectId() {
		return smsContectId;
	}
	public void setSmsContectId(long smsContectId) {
		this.smsContectId = smsContectId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	
	
	

}
