package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.Customerdto;
import com.example.demo.entites.Customer;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@RequestMapping(name = "/saveCustomer", method = RequestMethod.POST)
	public Customer saveCustomer(@RequestBody Customerdto customerdto) {
		
		return customerService.saveCustomer(customerdto);
	}
	
	@RequestMapping(name="/getCustomerById",method=RequestMethod.GET)
    public Customer getCustomerById(String customer_id) {
		return customerService.getCustomerById(customer_id);
	}
	@RequestMapping(name="/updateCustomer",method=RequestMethod.PUT)
	public Customer updateCustomer(@RequestBody Customerdto customerdto) {
		return customerService.updateCustomer(customerdto);
	}
	public void deleteCustomer(String customerid) {
		 customerService.deleteCustomer(customerid);
	}
}
