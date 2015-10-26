package com.bid.service;
import com.bid.domain.Order;
import com.bid.domain.OrderDetail;
import java.util.List;
import java.util.Map;
public interface OrderService {
	void createOrder(OrderDetail orderDetail);
	void cancelOrder(OrderDetail orderDetail);
	void update(OrderDetail orderDetail);
	
	void updateOrder(Order order);
	
	List<OrderDetail> getOrdersAsList();
	Map<String, OrderDetail> getOrders();
}
