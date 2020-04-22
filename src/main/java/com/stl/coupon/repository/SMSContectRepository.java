package com.stl.coupon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stl.coupon.entities.SMSContectEntity;

@Repository("smsContectRepository")
public interface SMSContectRepository extends JpaRepository<SMSContectEntity, Long>{

}
