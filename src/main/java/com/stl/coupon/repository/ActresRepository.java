package com.stl.coupon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stl.coupon.entities.ActresEntity;

@Repository
public interface ActresRepository extends JpaRepository<ActresEntity, Long>{

}
