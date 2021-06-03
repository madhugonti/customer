package com.example.demo.dtos;

import com.example.demo.entites.Customer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerDto {

	private String customer_id;

	private String customer_Name;

	private String dateOfBirth;

	private String gender;

	private String phoneNumber;

	private List<DocumentDto> documentDtos = new ArrayList<>();

	public CustomerDto(String customer_id, String customer_Name, LocalDate dateOfBirth, String gender, String phoneNumber, List<DocumentDto> documentDtos) {
		this.customer_id = customer_id;
		this.customer_Name = customer_Name;
		this.dateOfBirth = dateOfBirth.format(DateTimeFormatter.ISO_LOCAL_DATE);
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.documentDtos = documentDtos;
	}

	public CustomerDto(Customer customer) {
		this.customer_id = customer.getCustomer_id();
		this.customer_Name = customer.getCustomer_Name();
		this.dateOfBirth = customer.getDateOfBirth().format(DateTimeFormatter.ISO_LOCAL_DATE);
		this.gender = customer.getGender();
		this.phoneNumber = customer.getPhoneNumber();
		this.documentDtos = customer.getListdoduments().stream().map(DocumentDto::new).collect(Collectors.toList());
	}

    public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_Name() {
		return customer_Name;
	}

	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth.format(DateTimeFormatter.ISO_LOCAL_DATE);
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<DocumentDto> getDocumentDtos() {
		return documentDtos;
	}

	public void setDocumentDtos(List<DocumentDto> documentDtos) {
		this.documentDtos = documentDtos;
	}
}
