package com.example.demo.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "document")
public class Document {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "document_id")
	private String documnetId;

	@Column(name = "type")
	private String type;

	@Column(name = "dateOfIssue")
	private String dateOfIssue;

	@Column(name = "dateOfExpiry")
	private String dateOfExpiry;

	@Column(name = "issueingAurthority")
	private String issueingAurthority;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;

	public Document() {

	}

	public Document(String documnetId, String type, String dateOfIssue, String dateOfExpiry, String issueingAurthority,
			Customer customer) {
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
