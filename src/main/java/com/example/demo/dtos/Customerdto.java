package com.example.demo.dtos;

import java.util.Date;
import java.util.List;

import com.example.demo.entites.Document;

public class Customerdto {

	private String customer_id;

	private String customer_Name;

	private Date dateOfBirth;

	private String gender;

	private String phoneNumber;

	private List<Document> document;

	public String getCustomer_id() {
		return customer_id;
	}

	public String getCustomer_Name() {
		return customer_Name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Document> getDocument() {
		return document;
	}

	public void setDocument(List<Document> document) {
		this.document = document;
	}

	@Override
	public String toString() {
		return "Customerdto [customer_id=" + customer_id + ", customer_Name=" + customer_Name + ", dateOfBirth="
				+ dateOfBirth + ", gender=" + gender + ", phoneNumber=" + phoneNumber + ", document=" + document + "]";
	}

	
	

}
