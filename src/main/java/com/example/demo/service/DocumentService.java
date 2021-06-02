package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dtos.Documentdto;
import com.example.demo.entites.Document;

@Component
@Service
public interface DocumentService {

	Document saveDocument(Documentdto documentdto, String customer_id);

	public List<Document> getAllDocuments(@PathVariable String customer_id);

}
