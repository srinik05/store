package com.in.docstore.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.docstore.entity.Customer;
import com.in.docstore.repository.DocStoreRepo;

@Service
public class DocStoreService {

	@Autowired
	private DocStoreRepo docStoreRepo;

	//getting all Customers  
	public List<Customer> getAllCustomers()   
	{  
		List<Customer> customers = new ArrayList<Customer>();  
		docStoreRepo.findAll().forEach(customer -> customers.add(customer));  
		return customers;  
	}  


	//getting a specific customer
	public Customer getCustomerById(Long custId)   
	{  
		return docStoreRepo.findById(custId).get();  
	}  

	//add customer  
	public void addCustomer(Customer customer)   
	{  
		docStoreRepo.save(customer);  
	}  

	//deleting Customer
	public void deleteCustomer(Long custId)   
	{  
		docStoreRepo.deleteById(custId);  
	}  

}
