package com.stl.coupon.dto;

import lombok.Data;

@Data
public class CouponModel {
	
	private long id;
	private String couponCode;
	private String couponName;
	private String startDate;	
	private String expiryDate;
	private int status;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public String getCouponName() {
		return couponName;
	}
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return String.format(
				"CouponModel [id=%s, couponCode=%s, couponName=%s, startDate=%s, expiryDate=%s, status=%s]", id,
				couponCode, couponName, startDate, expiryDate, status);
	}
	
	
	

}
