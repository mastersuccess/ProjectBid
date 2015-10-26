package com.bid.domain;

public class Product extends Item{

	
	public Product(String id, String name, String description, String category, String dateCreated) {
		super(id, name, description, category, dateCreated);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("id=%s | name=%s | description=%s | category=%s | date-created=%s", this.getId(),this.getName(),this.getDescription(),this.getCategory(),this.getDateCreated());
	}
}
