package com.in.docstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in.docstore.entity.Customer;
import com.in.docstore.service.DocStoreService;

@RestController
@RequestMapping(value = "/api")
public class DocStoreController {

	@Autowired
	private DocStoreService docStoreService;

	//Endpoint for adding new customer  
	@PostMapping("/customer")  
	private void addCustomer(@RequestBody Customer customer)   
	{  
		docStoreService.addCustomer(customer);  
	}  

	//Endpoint for getting the all customer details 
	@GetMapping("/customers")  
	private List<Customer> getAllCustomers()   
	{  
		return docStoreService.getAllCustomers();  
	}  

	//Endpoint for  a get mapping that retrieves the detail of a specific book  
	@GetMapping("/customer/{custId}")  
	private Customer getCustomerId(@PathVariable("custId") Long custId)   
	{  
		return docStoreService.getCustomerById(custId);  
	} 

	//Endpoint for delete the Customer details
	@DeleteMapping("/customer/{custId}")  
	private void deleteCustomer(@PathVariable("custId") Long custId)   
	{  
		docStoreService.deleteCustomer(custId);  
	}  



}
