package com.stl.coupon.dto;

import java.util.List;

public class CouponResponse extends AbstractResponse{
	
	private List<CouponResponsePojo> couponResponse;

	public List<CouponResponsePojo> getCouponResponse() {
		return couponResponse;
	}
	public void setCouponResponse(List<CouponResponsePojo> couponResponse) {
		this.couponResponse = couponResponse;
	}
	
	
}
