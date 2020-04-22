package com.stl.coupon.dto;

public class SMSContectModel {
	
	private long id;
	private String sms;
	private int ststus;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSms() {
		return sms;
	}
	public void setSms(String sms) {
		this.sms = sms;
	}
	public int getStstus() {
		return ststus;
	}
	public void setStstus(int ststus) {
		this.ststus = ststus;
	}
	@Override
	public String toString() {
		return String.format("SMSContectModel [id=%s, sms=%s, ststus=%s]", id, sms, ststus);
	}

	
}
