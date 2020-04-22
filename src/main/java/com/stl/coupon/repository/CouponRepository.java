package com.stl.coupon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stl.coupon.entities.CouponEntity;

@Repository("couponRepository")
public interface CouponRepository extends JpaRepository<CouponEntity, Long> {

}
