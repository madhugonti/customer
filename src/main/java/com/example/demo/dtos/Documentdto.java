package com.example.demo.dtos;

import com.example.demo.entites.Customer;

public class Documentdto {

	private String documnetId;

	private String type;

	private String dateOfIssue;

	private String dateOfExpiry;

	private String issueingAurthority;

	private Customer customer;

	public Documentdto() {

	}

	public Documentdto(String documnetId, String type, String dateOfIssue, String dateOfExpiry,
			String issueingAurthority, Customer customer) {
		super();
		this.documnetId = documnetId;
		this.type = type;
		this.dateOfIssue = dateOfIssue;
		this.dateOfExpiry = dateOfExpiry;
		this.issueingAurthority = issueingAurthority;
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getDocumnetId() {
		return documnetId;
	}

	public String getType() {
		return type;
	}

	public String getDateOfIssue() {
		return dateOfIssue;
	}

	public String getDateOfExpiry() {
		return dateOfExpiry;
	}

	public String getIssueingAurthority() {
		return issueingAurthority;
	}

	public void setDocumnetId(String documnetId) {
		this.documnetId = documnetId;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public void setIssueingAurthority(String issueingAurthority) {
		this.issueingAurthority = issueingAurthority;
	}

}
