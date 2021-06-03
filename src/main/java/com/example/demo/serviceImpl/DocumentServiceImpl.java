package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.demo.exceptions.CustomerIdNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dtos.DocumentDto;
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
	public DocumentDto saveDocument(DocumentDto documentdto, String customer_id) {
		Document d = new Document();
//		d.setDocumnetId(documentdto.getDocumnetId());
		d.setIssueingAurthority(documentdto.getIssueingAurthority());
		d.setDateOfIssue(documentdto.getDateOfIssue());
		d.setDateOfExpiry(documentdto.getDateOfExpiry());
		d.setType(documentdto.getType());
		Optional<Customer> optionalCustomer = customerRepository.findById(customer_id);
		if (!optionalCustomer.isPresent()) {
			throw new CustomerIdNotFound();
		}
		d.setCustomer(optionalCustomer.get());
		documentRepository.save(d);
		return documentdto;
	}

	@Override
	public List<DocumentDto> getAllDocuments(String customer_id) {
	 List<Document> listdocuments =  documentRepository.findBycustomer(customer_id);

		return listdocuments.stream().map(DocumentDto::new).collect(Collectors.toList());
	}

}
