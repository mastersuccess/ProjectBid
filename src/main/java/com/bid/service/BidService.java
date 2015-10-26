package com.bid.service;


import java.util.List;
import java.util.Map;
import com.bid.domain.Bid;
import com.bid.domain.BidProduct;

public interface BidService {
	void postBidProduct(BidProduct bidProduct);
	void cancelBidProduct(BidProduct bidProduct);
	BidProduct getBidProduct();
	void changeBidProductStatusIfExpire(BidProduct bidProduct);
	
	void addBid(Bid bid);
	void cancelBid(Bid bid);
	
	
	
	List<Bid> getBidAsList();
	Map<String,Bid> getBids();
	
	int getBidCount();
	
	
}
