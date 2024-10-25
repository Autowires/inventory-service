package com.microservices.inventory.service;

import java.util.List;

import org.springframework.http.HttpStatusCode;

import com.microservices.inventory.entity.Inventory;

public interface InventoryServiceInterface {

	Inventory addInventoryService(Inventory inventory);

	List<Inventory> getInventoryService();

	Inventory getInventorybyIdService(Long productId);

}
