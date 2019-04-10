package com.vans.qa.models;

public class Producto {
	
	private String size;
	private String quantity;
	public Producto(String size, String quantity) {
		super();
		this.size = size;
		this.quantity = quantity;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	}


