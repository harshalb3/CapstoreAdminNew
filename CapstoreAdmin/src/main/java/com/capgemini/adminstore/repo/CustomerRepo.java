package com.capgemini.adminstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.adminstore.beans.Customer;
@Repository
public interface CustomerRepo extends JpaRepository<Customer, String>{

}
