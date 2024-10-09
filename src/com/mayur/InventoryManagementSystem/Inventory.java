package com.mayur.InventoryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

	private List<Product> ProductList = new ArrayList<>();

	public List<Product> getProductList() {
		return ProductList;
	}

	public void setProductList(List<Product> productList) {
		ProductList = productList;
	}

	public void addProduct(Product product) {
		ProductList.add(product);
		System.out.println(product.getName());
	}

	public void viewProducts() {
		for (Product product : ProductList) {
			System.out.println(product);
		}
	}

	public void updateQuantity(String name, int quantity) {
		for (Product product : ProductList) {
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
		return "Inventory [ProductList=" + ProductList + "]";
	}

}
