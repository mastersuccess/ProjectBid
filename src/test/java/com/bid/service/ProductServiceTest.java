package com.bid.service;

import com.bid.domain.Product;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ProductServiceTest extends TestCase{
	ProductService productService;
	
	@Override
	protected void setUp() throws Exception {
		productService = new ProductServiceImpl();
		

		productService.addProduct(new Product("0002", "Mountain Bike", "High-end", "Bicycle", "2015-10-23"));
		
	}
	
	public void testAddProduct(){
		Product product = new Product("0001", "iphone", "5s any color", "electronics/mobile", "2015-10-23");
		productService.addProduct(product);
		Assert.assertEquals(true, productService.isProductExist(product));
	}
	
	public void testUpdateProduct(){
		productService.updateProduct(new Product("0002", "Mountain Bike", "low-end", "Bicycle", "2015-10-23"));
		
		Product product = productService.getProduct("0002");
		
		Assert.assertEquals(true, product != null);
		Assert.assertEquals("0002", product.getId());
		Assert.assertEquals("low-end", product.getDescription());
	}
	
	public void testIsProductExist(){
		Product product = productService.getProduct("0002");
		Assert.assertEquals(true, product != null);
	}
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}
}
