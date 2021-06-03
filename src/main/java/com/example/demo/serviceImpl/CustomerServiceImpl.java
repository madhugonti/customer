package com.example.demo.serviceImpl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.demo.dtos.DocumentDto;
import com.example.demo.entites.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dtos.CustomerDto;
import com.example.demo.entites.Customer;
import com.example.demo.exceptions.CustomerIdNotFound;
import com.example.demo.repositories.CustomerRepository;
import com.example.demo.service.CustomerService;

@Component
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public String saveCustomer(CustomerDto customerdto) {
		Customer c = new Customer();
		c.setCustomer_Name(customerdto.getCustomer_Name());
		c.setDateOfBirth(LocalDate.parse(customerdto.getDateOfBirth(), DateTimeFormatter.ISO_LOCAL_DATE));
		c.setGender(customerdto.getGender());
		c.setPhoneNumber(customerdto.getPhoneNumber());
//		c.setListdoduments(customerdto.getDocumentDtos().stream().map(i -> setDocuments(i, c)).collect(Collectors.toList()));
		Customer customer = customerRepository.save(c);
		return customer.getCustomer_id();
	}

	private Document setDocuments(DocumentDto documentdto, Customer c) {
		Document document = new Document();
		document.setCustomer(c);
		document.setDateOfExpiry(documentdto.getDateOfExpiry());
		document.setType(documentdto.getType());
		document.setDateOfIssue(documentdto.getDateOfIssue());
		document.setIssueingAurthority(documentdto.getIssueingAurthority());
		return document;
	}

	@Override
	public CustomerDto getCustomerById(String customer_id) {
		Optional<Customer> optionalCustomer = customerRepository.findById(customer_id);
		if (optionalCustomer.isPresent()) {
			return new CustomerDto(optionalCustomer.get());
		}
		return null;
	}

	@Override
	public CustomerDto updateCustomer(CustomerDto customerdto) {
		Optional<Customer> findById = customerRepository.findById(customerdto.getCustomer_id());
		if (findById.isPresent()) {
			Customer customer = findById.get();
			customer.setCustomer_id(customerdto.getCustomer_id());
			customer.setCustomer_Name(customerdto.getCustomer_Name());
			customer.setDateOfBirth(LocalDate.parse(customerdto.getDateOfBirth(), DateTimeFormatter.ISO_LOCAL_DATE));
			customer.setGender(customerdto.getGender());
			customer.setPhoneNumber(customerdto.getPhoneNumber());
			customerRepository.save(customer);
		} else {
			throw new CustomerIdNotFound();
		}
		return customerdto;
	}

	@Override
	public void deleteCustomer(String customerid) {
		customerRepository.deleteById(customerid);
	}

	@Override
	public List<CustomerDto> getAllCustomers() {
		List<Customer> customers = customerRepository.findAll();
		return customers.stream().map(CustomerDto::new).collect(Collectors.toList());
	}

}
