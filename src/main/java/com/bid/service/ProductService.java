package com.bid.service;

import com.bid.domain.Product;
import java.util.List;
import java.util.Map;

public interface ProductService {
	void addProduct(Product product);

	void updateProduct(Product product);

	void removeProduct(Product product);

	Product getProduct(String productId);

	List<Product> getProductsAsList();

	Map<String, Product> getProducts();
	
	int countItems();
	
	boolean isProductExist(Product product);
}
