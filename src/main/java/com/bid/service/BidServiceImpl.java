package com.bid.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.bid.domain.Bid;
import com.bid.domain.BidProduct;

public class BidServiceImpl implements BidService
{
	BidProduct bidProduct;
	Bid bid;
	Map<String, Bid> bids;
	
	public BidServiceImpl()
	{
		this.bids = new HashMap<>();
	}
	
	@Override
	public void postBidProduct(BidProduct bidProduct)
	{
		this.bidProduct = bidProduct;
	}

	/*@Override
	public void cancelBidProduct(BidProduct bidProduct)
	{
		
		 bids.remove(bidProduct);
	}
*/
	@Override
	public BidProduct getBidProduct()
	{

		return this.bidProduct;
	}

	@Override
	public void changeBidProductStatusIfExpire(BidProduct bidProduct)
	{
		this.bidProduct.setStatus(bidProduct.getStatus());
		
	}

	@Override
	public void addBid(Bid bid)
	{
		this.bids.put(bid.getBidId(), bid);
	}

	@Override
	public void cancelBid(Bid bid)
	{
		  this.bids.put(bid.getBidId(), bid);
	}

	@Override
	public List<Bid> getBidAsList()
	{
		return this.bids.values().stream().collect(Collectors.toList());
	}

	@Override
	public Map<String, Bid> getBids()
	{
		return this.bids;
	}

	@Override
	public int getBidCount()
	{
		return bids.size();
	}

	@Override
	public boolean isBidProductExist(BidProduct bidProduct)
	{

		return bidProduct.getId()!=null;
	}

	@Override
	public boolean isBidExist(Bid bid)
	{

		return bid.getBidId()!=null;
	}

}
