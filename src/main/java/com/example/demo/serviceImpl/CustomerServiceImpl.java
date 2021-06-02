package com.example.demo.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dtos.Customerdto;
import com.example.demo.entites.Customer;
import com.example.demo.exceptions.CustomerIdNotFound;
import com.example.demo.repositories.CustomerRepository;
import com.example.demo.service.CustomerService;

@Component
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer saveCustomer(Customerdto customerdto) {
		Customer c = new Customer();
		c.setCustomer_id(customerdto.getCustomer_id());
		c.setCustomer_Name(customerdto.getCustomer_Name());
		c.setDateOfBirth(customerdto.getDateOfBirth());
		c.setGender(customerdto.getGender());
		c.setPhoneNumber(customerdto.getPhoneNumber());
		c.setListdoduments(customerdto.getDocument());
		Customer coustomer = customerRepository.save(c);
		return coustomer;
	}

	@Override
	public Customer getCustomerById(String customer_id) {
		Customer customer = customerRepository.findById(customer_id).get();
		return customer;
	}

	@Override
	public Customer updateCustomer(Customerdto customerdto) {
		Optional<Customer> findById = customerRepository.findById(customerdto.getCustomer_id());
		Customer updatecustomer = null;
		if (findById.isPresent()) {
			Customer cc = findById.get();
			cc.setCustomer_id(customerdto.getCustomer_id());
			cc.setCustomer_Name(customerdto.getCustomer_Name());
			cc.setDateOfBirth(customerdto.getDateOfBirth());
			cc.setGender(customerdto.getGender());
			cc.setPhoneNumber(customerdto.getPhoneNumber());
			updatecustomer = customerRepository.save(cc);
		} else {
			throw new CustomerIdNotFound();
		}
		return updatecustomer;
	}

	@Override
	public void deleteCustomer(String customerid) {
		Optional<Customer> findById = customerRepository.findById(customerid);
		if (findById.isPresent()) {
			customerRepository.deleteById(customerid);
		}

	}

}
