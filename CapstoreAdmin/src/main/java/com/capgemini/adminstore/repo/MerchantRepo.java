package com.capgemini.adminstore.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.adminstore.beans.Merchant;
@Repository
public interface MerchantRepo extends JpaRepository<Merchant, Integer>{

//	@Query("select merchant from  Merchant merchant")
//	public List<Merchant> findAllMerchants();
	
}
