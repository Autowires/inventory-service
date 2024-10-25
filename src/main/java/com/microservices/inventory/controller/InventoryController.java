package com.microservices.inventory.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.inventory.service.InventoryServiceInterface;

@RestController
@CrossOrigin("http://localhost:8084/")

@RequestMapping("/api/inventory")
public class InventoryController {
	
	@Autowired
	private InventoryServiceInterface inventoryService;
	
	public inventory 
	
	

}
