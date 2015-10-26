package com.bid.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.bid.domain.Product;

public class ProductServiceImpl implements ProductService{
	Map<String,Product> products;
	Product product;
	
	public ProductServiceImpl() {
		products = new HashMap<>();
	}
	@Override
	public void addProduct(Product product) {
		if(product==null){
			throw new IllegalArgumentException("Cannot add null product");
		}
		products.put(product.getId(), product);
	}

	@Override
	public void updateProduct(Product product) {
		products.put(product.getId(), product);
	}
	

	@Override
	public void removeProduct(Product product) {
		products.remove(product.getId());
	}

	@Override
	public Product getProduct(String productId) {
		return this.products.get(productId);
	}

	@Override
	public List<Product> getProductsAsList() {
		return products.values().stream().collect(Collectors.toList());
	}

	@Override
	public Map<String, Product> getProducts() {
		
		return this.products;
	}
	@Override
	public int countItems() {
		return products.size();
	}
	@Override
	public boolean isProductExist(Product product) {
		
		return products.get(product.getId())!=null;
	}
	
}
