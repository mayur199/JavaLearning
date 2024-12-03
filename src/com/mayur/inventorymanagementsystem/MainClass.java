package com.mayur.inventorymanagementsystem;

public class MainClass {
	public static void main(String[] args) {
		Inventory i = new Inventory();
		Product p1 = new Product();
		p1.setName("Laptop");
		p1.setQuantity(10);
		p1.setPrice(50000);
		Product p2 = new Product();
		p2.setName("Mobile");
		p2.setQuantity(10);
		p2.setPrice(25000);
		Product p3 = new Product();
		p3.setName("Headphone");
		p3.setQuantity(25);
		p3.setPrice(1200);
		i.addProduct(p1);
		i.addProduct(p2);
		i.addProduct(p3);
		i.viewProducts();
		
		i.updateQuantity("Mobile", 20);
		
		i.viewProducts();

	}

}
