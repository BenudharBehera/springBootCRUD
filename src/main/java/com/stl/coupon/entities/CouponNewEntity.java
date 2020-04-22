package com.stl.coupon.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.stl.coupon.dto.CouponId;

import lombok.Data;

@Entity
@Data
@Table(name = "coupon",schema = "coupon")
@IdClass(CouponId.class)
public class CouponNewEntity  {
	
	@Id
	@Column(name = "coupon_id")
	private long coupon_id;
	
	@Id
	@Column(name = "subcoupon_id")
	private long subcoupon_id;
	
	@Column(name = "coupon_name")
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
		return String.format("CouponNewEntity [coupon_id=%s, subcoupon_id=%s, coupon_name=%s]", coupon_id, subcoupon_id,
				coupon_name);
	}
	
	
	

}
