package com.bid.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.bid.domain.Bid;
import com.bid.domain.BidProduct;

public class BidServiceImpl implements BidService{
	BidProduct bidProduct;
	Map<String, Bid> bids;
	

	@Override
	public void postBidProduct(BidProduct bidProduct) {
		this.bidProduct = bidProduct;
	}

	public BidServiceImpl() {
		this.bids = new HashMap<>();
	}

	@Override
	public void cancelBidProduct(BidProduct bidProduct) {
		
	}

	@Override
	public BidProduct getBidProduct() {
		// TODO Auto-generated method stub
		return this.bidProduct;
	}

	@Override
	public void changeBidProductStatus(BidProduct bidProduct) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addBid(Bid bid) {
		this.bids.put(bid.getBidId(), bid);
	}

	@Override
	public void cancelBid(Bid bid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Bid> getBidAsList() {
		// TODO Auto-generated method stub
		return this.bids.values().stream().collect(Collectors.toList());
	}

	@Override
	public Map<String, Bid> getBids() {
		// TODO Auto-generated method stub
		return this.bids;
	}

	@Override
	public int getBidCount() {
		return this.bids.size();
	}

}
