package com.microservices.inventory.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class InventoryNotFoundException extends Exception {

	public InventoryNotFoundException(String message) {
		super(message);
	}

}
