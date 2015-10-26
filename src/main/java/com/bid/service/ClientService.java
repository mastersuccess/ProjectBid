package com.bid.service;
import com.bid.domain.Supplier;
import java.util.Map;

import java.util.List;

import com.bid.domain.Customer;

public interface ClientService {
	void addSupplier(Supplier supplier);
	void addCustomer(Customer customer);
	
	Customer getCustomer();
	Supplier getSupplier();
	
	List<Customer> getCustomersAsList();
	List<Supplier> getSuppliersAsList();
	
	Map<String, Supplier> getSuppliers();
	Map<String, Customer> getCustomers();
	
	void updateSupplier(Supplier supplier);
	void updateCustomer(Customer customer);
	
	void removeSupplier(Supplier supplier);
	void removeCustomer(Customer customer);
	
}
