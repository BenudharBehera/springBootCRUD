package com.stl.coupon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.stl.coupon.entities.UserEntity;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<UserEntity, Long>{
	
	@Query("select max(id) from UserEntity")
	Integer findMaxId();

}
