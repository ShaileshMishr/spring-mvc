package com.training.springmvc.dao;

import java.util.List;

import com.training.springmvc.model.Product;

public interface ProductDao {

	//this method will fetch me a product for a given id
		Product getProductById(int id);
		
		//this method will fetch all the products in the database
		List<Product> getProducts();
		
		//This method will create a new product in the database
		boolean createProduct(Product product);
		boolean deleteProduct(int prodId);

		boolean updateProduct(Product product);
}
