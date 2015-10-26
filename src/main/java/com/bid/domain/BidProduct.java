package com.bid.domain;

public class BidProduct extends Item {
	
	public BidProduct(String id, String name, String description, String category, String dateCreated) {
		super(id, name, description, category, dateCreated);
		// TODO Auto-generated constructor stub
	}
	private String detail;
	private String status;
	private String datePosted;
	
	public BidProduct(String id, String name, String description, String category, String dateCreated, String detail,
			String status, String datePosted) {
		super(id, name, description, category, dateCreated);
		this.detail = detail;
		this.status = status;
		this.datePosted = datePosted;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDatePosted() {
		return datePosted;
	}

	public void setDatePosted(String datePosted) {
		this.datePosted = datePosted;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("id=%s | name=%s | description=%s | category=%s | date-created=%s | detail=%s | status=%s | date-posted=%s", this.getId(),this.getName(),this.getDescription(),this.getCategory(),this.getDateCreated(),this.getDetail(),this.getStatus(),this.getDatePosted());
	}

}
