package com.capgemini.adminstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.adminstore.beans.Review;
@Repository
public interface ReviewRepo extends JpaRepository<Review, Integer> {

}
