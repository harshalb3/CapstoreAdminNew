package com.capgemini.adminstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.adminstore.beans.Coupon;
@Repository
public interface CouponRepo extends JpaRepository<Coupon, Integer>{

}
