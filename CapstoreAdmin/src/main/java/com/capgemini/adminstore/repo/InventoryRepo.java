package com.capgemini.adminstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.adminstore.beans.Inventory;
@Repository
public interface InventoryRepo extends JpaRepository<Inventory, Integer> {

}
