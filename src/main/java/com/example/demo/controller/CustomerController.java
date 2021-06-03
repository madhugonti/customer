package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dtos.CustomerDto;
import com.example.demo.entites.Customer;
import com.example.demo.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<String> saveCustomer(@RequestBody CustomerDto customerdto) {
		return new ResponseEntity<>(customerService.saveCustomer(customerdto), HttpStatus.OK);
	}
	
	@RequestMapping(value="/{customerId}",method=RequestMethod.GET)
    public CustomerDto getCustomerById(@PathVariable("customerId") String customer_id) {
		return customerService.getCustomerById(customer_id);
	}
	@RequestMapping(method=RequestMethod.PUT)
	public CustomerDto updateCustomer(@RequestBody CustomerDto customerdto) {
		return customerService.updateCustomer(customerdto);
	}

	@RequestMapping(value="/{customerId}",method=RequestMethod.DELETE)
	public void deleteCustomer(@PathVariable("customerId") String customerid) {
		 customerService.deleteCustomer(customerid);
	}

	@RequestMapping(value="/all",method=RequestMethod.GET)
	public ResponseEntity<List<CustomerDto>> getAllCustomers() {
		List<CustomerDto> customerDtos = customerService.getAllCustomers();
		return new ResponseEntity<>(customerDtos, HttpStatus.OK);
	}
}
