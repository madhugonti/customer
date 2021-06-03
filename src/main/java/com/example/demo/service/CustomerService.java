package com.example.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.dtos.CustomerDto;
import com.example.demo.entites.Customer;

import java.util.List;

@Component
@Service

public interface CustomerService {

	String saveCustomer(CustomerDto customerdto);

	CustomerDto getCustomerById(String customer_id);

	CustomerDto updateCustomer(CustomerDto customerdto);

	public void  deleteCustomer(String customerid);

	List<CustomerDto> getAllCustomers();
}
