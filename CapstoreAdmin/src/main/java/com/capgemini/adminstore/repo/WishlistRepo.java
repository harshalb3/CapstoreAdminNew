package com.capgemini.adminstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.adminstore.beans.Wishlist;
@Repository
public interface WishlistRepo extends JpaRepository<Wishlist, Integer> {

}
