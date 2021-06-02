package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dtos.Documentdto;
import com.example.demo.entites.Customer;
import com.example.demo.entites.Document;
import com.example.demo.repositories.CustomerRepository;
import com.example.demo.repositories.DocumentRepository;
import com.example.demo.service.DocumentService;

@Component
public class DocumentServiceImpl implements DocumentService {
	@Autowired
	private DocumentRepository documentRepository;
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Document saveDocument(Documentdto documentdto, String customer_id) {
		Document d = new Document();
		d.setDocumnetId(documentdto.getDocumnetId());
		d.setIssueingAurthority(documentdto.getIssueingAurthority());
		d.setDateOfIssue(documentdto.getDateOfIssue());
		d.setDateOfExpiry(documentdto.getDateOfExpiry());
		d.setType(documentdto.getType());
		Customer customer = customerRepository.findById(customer_id).get();
		d.setCustomer(customer);
		Document document = documentRepository.save(d);
		return document;
	}

	@Override
	public List<Document> getAllDocuments(String customer_id) {
	 List<Document> listdocuments =  documentRepository.findBycustomer(customer_id);

		return listdocuments;
	}

}
