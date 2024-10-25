package com.microservices.inventory.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.inventory.entity.Inventory;

@Repository
public interface InventoryRepository  extends JpaRepository<Inventory,  Long >{

	Inventory findByProductId(Long productId);
	
}
