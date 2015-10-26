package com.bid.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.bid.domain.Bid;
import com.bid.domain.BidProduct;
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
	
	public static void main(String[] args) {
		ProductService productService = new ProductServiceImpl();
		Product product = new Product("0001", "iphone", "5s any color", "electronics/mobile", "205-10-23");
		productService.addProduct(product);
		System.out.println(productService.getProduct("0001"));
		System.out.println(productService.countItems());
		
		BidService bidService = new BidServiceImpl();
		bidService.postBidProduct(new BidProduct(product.getId(), product.getName(), product.getDescription(), product.getCategory(), product.getDateCreated(), "1 Black ", "Newly Posted", "2015-10-24"));
		
		System.out.println(bidService.getBidProduct());
		bidService.addBid(new Bid("bid-1", product.getId(), "1 black = 5000", "2015-10-24"));
		bidService.addBid(new Bid("bid-2", product.getId(), "1 black = 3000", "2015-10-24"));
		
		List<Bid> bids = bidService.getBidAsList();
		for (Bid bid : bids) {
			System.out.println(bid.toString());
		}
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
