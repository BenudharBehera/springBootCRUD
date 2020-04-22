package com.stl.coupon.dto;

import java.io.Serializable;

public class CouponId implements Serializable{

	private long coupon_id;
	private long subcoupon_id;
	
	public CouponId(long coupon_id, long subcoupon_id) {
		super();
		this.coupon_id = coupon_id;
		this.subcoupon_id = subcoupon_id;
	}
	public CouponId() {
	}
	
}
