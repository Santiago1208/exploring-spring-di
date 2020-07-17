package com.example.springdi.models.domain;

public class ReceiptItem {

	private Product product;
	private Integer quantity;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public ReceiptItem(Product product, Integer quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	public Integer calculateTotal() {
		return product.getPrice() * quantity;
	}
	
	
}
