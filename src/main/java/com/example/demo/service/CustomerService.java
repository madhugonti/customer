package com.example.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.dtos.Customerdto;
import com.example.demo.entites.Customer;

@Component
@Service

public interface CustomerService {

	Customer saveCustomer(Customerdto customerdto);

	Customer getCustomerById(String customer_id);

	Customer updateCustomer(Customerdto customerdto);

	public void  deleteCustomer(String customerid);

}
