package com.stl.coupon.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sms_log", schema = "coupon")
public class SMSLogEntity {

	@Id
	@GeneratedValue
	private long id;
	@Column (name = "sms_contect")
	private long smsContectId;
	
	@Column(name = "user_id")
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
