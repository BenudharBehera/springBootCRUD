package com.stl.coupon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stl.coupon.entities.EmployeAccountEntity;

@Repository
public interface EmpAccountRepository extends JpaRepository<EmployeAccountEntity, Long>{

}
