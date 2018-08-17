package com.capgemini.adminstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.adminstore.beans.Category;
@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
