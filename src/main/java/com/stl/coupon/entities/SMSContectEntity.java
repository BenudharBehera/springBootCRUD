package com.stl.coupon.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sms_master",schema = "coupon")
public class SMSContectEntity {
		
	@GeneratedValue
	@Id
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
	
	

}
