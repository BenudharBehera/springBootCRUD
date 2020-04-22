package com.stl.coupon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.stl.coupon.entities.ActorEntity;

@Repository
public interface ActorRepository extends JpaRepository<ActorEntity, Long>{

}
