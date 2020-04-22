package com.stl.coupon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stl.coupon.entities.SMSLogEntity;
@Repository("smsLogRepository")
public interface SMSLogRepository extends JpaRepository<SMSLogEntity, Long>{

}
