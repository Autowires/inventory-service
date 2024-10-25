package com.microservices.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.inventory.dao.InventoryRepository;
import com.microservices.inventory.entity.Inventory;

@Service
public class InventoryService implements InventoryServiceInterface {

	@Autowired
	InventoryRepository inventoryrepo;
	
	@Override
	public Inventory addInventoryService(Inventory inventory) {
		return inventoryrepo.save(inventory);
	}

	@Override
	public List<Inventory> getInventoryService() {
		return inventoryrepo.findAll();
	}

	@Override
	public Inventory getInventorybyIdService(Long productId) {
		
		return inventoryrepo.findByProductId(productId);
	}
	
	

}
