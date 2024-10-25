package com.microservices.inventory.dto;

public class InventoryDto {
	
	private long productId;
	private int quantity;
	
	public InventoryDto() {
		// TODO Auto-generated constructor stub
	}
	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
