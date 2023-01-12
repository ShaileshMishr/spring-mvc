package com.training.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springmvc.dao.ProductDao;
import com.training.springmvc.model.Product;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDao productDao;
	
	@Override
	public Product getProduct() {
		Product p1 = productDao.getProductById(101);
		return p1;
	}
	
	@Override
	public List<Product> getAllProducts() {
		List<Product> productList = productDao.getProducts();
		return productList;
	}

	@Override
	public boolean addProduct(Product product) {
		
		return productDao.createProduct(product);
	}
	@Override
	public boolean deleteProduct(int prodId) {
		
		return productDao.deleteProduct(prodId);
	}

	@Override
	public boolean updateProduct(Product product) {
		return productDao.updateProduct(product);
	}

}
