package com.stl.coupon.dto;

public class CouponNewModel {
	
	private long coupon_id;
	private long subcoupon_id;
	private String coupon_name;
	
	public long getCoupon_id() {
		return coupon_id;
	}
	public void setCoupon_id(long coupon_id) {
		this.coupon_id = coupon_id;
	}
	public long getSubcoupon_id() {
		return subcoupon_id;
	}
	public void setSubcoupon_id(long subcoupon_id) {
		this.subcoupon_id = subcoupon_id;
	}
	public String getCoupon_name() {
		return coupon_name;
	}
	public void setCoupon_name(String coupon_name) {
		this.coupon_name = coupon_name;
	}
	@Override
	public String toString() {
		return String.format("CouponNewModel [coupon_id=%s, subcoupon_id=%s, coupon_name=%s]", coupon_id, subcoupon_id,
				coupon_name);
	}
	
	

}
