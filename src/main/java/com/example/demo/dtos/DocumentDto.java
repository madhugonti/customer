package com.example.demo.dtos;

import com.example.demo.entites.Document;

public class DocumentDto {

	private String documnetId;

	private String type;

	private String dateOfIssue;

	private String dateOfExpiry;

	private String issueingAurthority;

	private CustomerDto customerdto;

	public DocumentDto() {

	}

	public DocumentDto(Document document) {
		this.documnetId = document.getDocumnetId();
		this.type = document.getType();
		this.dateOfIssue = document.getDateOfIssue();
		this.dateOfExpiry = document.getDateOfExpiry();
		this.issueingAurthority = document.getIssueingAurthority();
	}

	public String getDocumnetId() {
		return documnetId;
	}

	public void setDocumnetId(String documnetId) {
		this.documnetId = documnetId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public String getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public String getIssueingAurthority() {
		return issueingAurthority;
	}

	public void setIssueingAurthority(String issueingAurthority) {
		this.issueingAurthority = issueingAurthority;
	}

	public CustomerDto getCustomerdto() {
		return customerdto;
	}

	public void setCustomerdto(CustomerDto customerdto) {
		this.customerdto = customerdto;
	}

	public DocumentDto(String documnetId, String type, String dateOfIssue, String dateOfExpiry, String issueingAurthority, CustomerDto customerdto) {
		this.documnetId = documnetId;
		this.type = type;
		this.dateOfIssue = dateOfIssue;
		this.dateOfExpiry = dateOfExpiry;
		this.issueingAurthority = issueingAurthority;
		this.customerdto = customerdto;
	}
}
