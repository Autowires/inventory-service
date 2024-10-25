package com.microservices.inventory.entity;

import java.sql.Timestamp;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="inventory")
public class Inventory {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long inventoryId;
	@Column(unique = true)
	private long productId ;
	private int quantity;
	@UpdateTimestamp
	private Timestamp  updatedAt ;
	public long getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(long inventoryId) {
		this.inventoryId = inventoryId;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long product_id) {
		this.productId = product_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
}
