package com.bid.domain;

public class Bid {
	private String bidId;
	private String bidProductId;
	private String bidQuotation;
	private String bidStatus;

	public Bid(String bidId, String bidProductId, String bidQuotation, String bidStatus) {
		this.bidId = bidId;
		this.bidProductId = bidProductId;
		this.bidQuotation = bidQuotation;
		this.bidStatus = bidStatus;
	}

	public String getBidId() {
		return bidId;
	}

	public void setBidId(String bidId) {
		this.bidId = bidId;
	}

	public String getBidProductId() {
		return bidProductId;
	}

	public void setBidProductId(String bidProductId) {
		this.bidProductId = bidProductId;
	}

	public String getBidQuotation() {
		return bidQuotation;
	}

	public void setBidQuotation(String bidQuotation) {
		this.bidQuotation = bidQuotation;
	}

	public String getBidStatus() {
		return bidStatus;
	}

	public void setBidStatus(String bidStatus) {
		this.bidStatus = bidStatus;
	}

}
