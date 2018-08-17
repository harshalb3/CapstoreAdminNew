package com.capgemini.adminstore.controllers;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.adminstore.beans.Merchant;
import com.capgemini.adminstore.services.AdminServices;

@RestController	
public class AdminActionController {
	

	@Autowired
	private AdminServices adminService;
	
	//Working
	@RequestMapping(value="/addMerchant", method=RequestMethod.POST)
	public void addMerchant(@RequestBody Merchant merchant) {
		
		adminService.addMerchant(merchant);
	}
	
	@RequestMapping(value="/getAllMerchants", method=RequestMethod.GET)
	public List<Merchant> getAllMerchant() {
		List<Merchant> merch=adminService.viewAllMerchants();
		
		Iterator<Merchant> it=merch.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		return adminService.viewAllMerchants();
	}
	
	// Working
	@RequestMapping(value="/removeMerchant")
	public void removeMerchant(int merchantId) {
		
		adminService.removeMerchant(merchantId);
	}
	
}
