package com.stl.coupon.dto;

import java.util.List;

public class CouponNewResponseModel extends AbstractResponse {
	
	private List<CouponNewModel> couponNew;

	public List<CouponNewModel> getCouponNew() {
		return couponNew;
	}

	public void setCouponNew(List<CouponNewModel> couponNew) {
		this.couponNew = couponNew;
	}

	@Override
	public String toString() {
		return String.format("CouponNewResponseModel [couponNew=%s]", couponNew);
	}
	
	

}
