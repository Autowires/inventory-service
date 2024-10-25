package com.microservices.inventory.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.microservices.inventory.dto.InventoryDto;
import com.microservices.inventory.entity.Inventory;
import com.microservices.inventory.exceptions.InventoryNotFoundException;
import com.microservices.inventory.service.InventoryServiceInterface;

@RestController
public class InventoryController {

	@Autowired
	private InventoryServiceInterface inventoryService;

	@PostMapping("/addInvenory")
	public ResponseEntity<Inventory> addInventory(@RequestBody InventoryDto dto) {
		Inventory inventory = new Inventory();

		inventory.setProductId(dto.getProductId());
		inventory.setQuantity(dto.getQuantity());

		Inventory in = inventoryService.addInventoryService(inventory);
		return ResponseEntity.status(HttpStatus.CREATED).body(in);
	}

	@GetMapping("/api/inventory")
	public List<Inventory> getInventory() {
		List<Inventory> li=inventoryService.getInventoryService();
		return li;
	}
	
	@GetMapping("/api/inventory/{productId}")
	public ResponseEntity<Inventory> getInventoryByProductId(@PathVariable Long productId ) throws InventoryNotFoundException
	{
		Inventory inv=inventoryService.getInventorybyIdService(productId);
		
		if(inv!= null)
		{
			return ResponseEntity.status(HttpStatus.OK).body(inv);
		}
		else 
		throw new InventoryNotFoundException("InventoryNotFound for ProductId "+productId);
	}

}
