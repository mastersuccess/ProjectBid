package com.bid.domain;

public abstract class Item {
	private String id;
	private String name;
	private String description;
	private String category;
	private String dateCreated;
	public Item(String id, String name, String description, String category, String dateCreated) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.category = category;
		this.dateCreated = dateCreated;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	
}
