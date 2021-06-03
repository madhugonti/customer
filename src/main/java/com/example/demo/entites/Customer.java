package com.example.demo.entites;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

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
	private LocalDate dateOfBirth;

	@Column(name = "gender")
	private String gender;

	@Column(name = "phone_Number")
	private String phoneNumber;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Document> listdoduments = new ArrayList<>();

    public Customer(){
    	
    }
	
	public Customer(String customer_id, String customer_Name, String dateOfBirth, String gender, String phoneNumber,
			List<Document> listdoduments) {
		super();
		this.customer_id = customer_id;
		this.customer_Name = customer_Name;
		this.dateOfBirth = LocalDate.parse(dateOfBirth, DateTimeFormatter.ISO_LOCAL_DATE);
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

	public LocalDate getDateOfBirth() {
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

	public void setDateOfBirth(LocalDate dateOfBirth) {
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
