package com.mayur.inventorymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

	private List<Product> productList = new ArrayList<>();

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public void addProduct(Product product) {
		productList.add(product);
		System.out.println(product.getName());
	}

	public void viewProducts() {
		for (Product product : productList) {
			System.out.println(product);
		}
	}

	public void updateQuantity(String name, int quantity) {
		for (Product product : productList) {
			if (product.getName().equalsIgnoreCase(name)) {
				product.setQuantity(quantity);
				System.out.println("Updated " + name + " quantity to " + quantity);
				return;
			}
		}
		System.out.println("Product not found");
		}
	

	@Override
	public String toString() {
		return "Inventory [productList=" + productList + "]";
	}

}
