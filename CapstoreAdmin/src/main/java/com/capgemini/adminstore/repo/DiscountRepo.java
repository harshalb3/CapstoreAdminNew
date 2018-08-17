package com.capgemini.adminstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.adminstore.beans.Discount;
@Repository
public interface DiscountRepo extends JpaRepository<Discount, Integer>{

}
