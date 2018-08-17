package com.capgemini.adminstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.adminstore.beans.Orders;
@Repository
public interface OrdersRepo extends JpaRepository<Orders, Integer>{

}
