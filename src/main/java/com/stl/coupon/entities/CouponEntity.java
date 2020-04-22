package com.stl.coupon.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="coupon_details", schema = "coupon")
public class CouponEntity {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(name="coupon_code")
	private String couponCode;
	
	@Column(name="coupon_name")
	private String couponName;
	
	@Column(name="start_date")
	private String startDate;
	
	@Column(name="expiry_date")
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
		return String.format("CouponEntity [id=%s, couponCode=%s, couponName=%s]", id, couponCode, couponName);
	}

	
}
