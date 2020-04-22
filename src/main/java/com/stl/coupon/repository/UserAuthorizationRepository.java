package com.stl.coupon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stl.coupon.entities.UserAuthorizationEntity;

@Repository("/userAuthorizationRepository")
public interface UserAuthorizationRepository extends JpaRepository<UserAuthorizationEntity, Long> {

}
