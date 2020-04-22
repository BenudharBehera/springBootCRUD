package com.stl.coupon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stl.coupon.entities.MovieEntity;

public interface MovieRepository extends JpaRepository<MovieEntity, Long>{

}
