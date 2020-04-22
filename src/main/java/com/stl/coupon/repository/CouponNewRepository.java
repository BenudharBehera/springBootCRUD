package com.stl.coupon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stl.coupon.entities.CouponNewEntity;

@Repository("couponNewRepository")
public interface CouponNewRepository extends JpaRepository<CouponNewEntity, Long>{

	
}
