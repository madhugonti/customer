package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.Customer;
@Repository
public interface CustomerRepository  extends JpaRepository<Customer, String>{

}
