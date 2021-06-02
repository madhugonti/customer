package com.example.demo.entites;


import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "customer_id")
	private String customer_id;
	@Column(name = "customer_Name")
	private String customer_Name;
	@Column(name = "dateofBirth")
	private Date dateOfBirth;
	@Column(name = "gender")
	private String gender;
	@Column(name = "phone_Number")
	private String phoneNumber;
	@OneToMany(mappedBy = "customer")
	private List<Document> listdoduments;
    public Customer(){
    	
    }
	
	public Customer(String customer_id, String customer_Name, Date dateOfBirth, String gender, String phoneNumber,
			List<Document> listdoduments) {
		super();
		this.customer_id = customer_id;
		this.customer_Name = customer_Name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.listdoduments = listdoduments;
	}

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

	public List<Document> getListdoduments() {
		return listdoduments;
	}

	public void setListdoduments(List<Document> listdoduments) {
		this.listdoduments = listdoduments;
	}

	

	
}
