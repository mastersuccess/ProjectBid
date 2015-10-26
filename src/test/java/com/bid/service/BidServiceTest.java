package com.bid.service;

import java.util.List;

import com.bid.domain.Bid;
import com.bid.domain.BidProduct;
import junit.framework.Assert;
import junit.framework.TestCase;


public class BidServiceTest extends TestCase
{
	BidService bidService;
	
	@Override
	protected void setUp() throws Exception
	{
		bidService = new BidServiceImpl();
		
		bidService.postBidProduct(new BidProduct("01", "box", "brown box", "Papers", "2015-10-20", "100pcs", "processing", "2015-10-21"));
	}
	
	public void testPostBidProduct()
	{
		BidProduct bidProduct = new BidProduct("02", "box", "brown box", "Papers", "2015-10-20", "100pcs", "processing", "2015-10-21");
		bidService.postBidProduct(bidProduct);
		Assert.assertEquals(true, bidService.isBidProductExist(bidProduct));
	}
	
	/*public void testCancelBidProduct()
	{
		bidService.cancelBidProduct(new BidProduct("01", "box", "brown box", "Papers", "2015-10-20", "100pcs", "processing", "2015-10-21"));
		
		BidProduct bidProduct = bidService.getBidProduct();
		Assert.assertEquals(true, bidProduct != null);
		Assert.assertEquals("01", bidProduct.getId());
		Assert.assertEquals("brown box", bidProduct.getDescription());
	}*/
	
	public void testChangeBidProductStatusIfExpire()
	{
		bidService.changeBidProductStatusIfExpire(new BidProduct("01", "box", "brown box", "Papers", "2015-10-20", "100pcs", "processing", "2015-10-21"));
		
		BidProduct bidProduct = bidService.getBidProduct();
		Assert.assertEquals(true, bidProduct != null);
		Assert.assertEquals("01", bidProduct.getId());
		Assert.assertEquals("processing", bidProduct.getStatus());
	}
	
	public void testAddBid()
	{
		Bid bid = new Bid("02", "brown box", "deal", "2015-10-20");
		bidService.addBid(bid);
		Assert.assertEquals(true, bidService.isBidExist(bid));
	}
	
	/*public void testCancelBid()
	{
		bidService.cancelBid(new Bid("01", "brown box", "no deal", "2015-10-20"));

		List<Bid> bid = bidService.getBidAsList();
		Assert.assertEquals(true, bid != null);
		Assert.assertEquals("01", ((Bid) bid).getBidId());
		Assert.assertEquals("no deal",  ((Bid) bid).getBidQuotation());
	}
	*/
	public void testIsBidProductExist(){
		BidProduct bidProduct = bidService.getBidProduct();
		Assert.assertEquals(true, bidProduct != null);
	}
	
	public void testIsBidExist(){
		List<Bid> bid = bidService.getBidAsList();
		Assert.assertEquals(true, bid != null);
	}
	@Override
	protected void tearDown() throws Exception
	{
		super.tearDown();
	}
}
