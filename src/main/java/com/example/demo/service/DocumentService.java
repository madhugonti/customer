package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dtos.DocumentDto;
import com.example.demo.entites.Document;

@Component
@Service
public interface DocumentService {

	DocumentDto saveDocument(DocumentDto documentdto, String customer_id);

	List<DocumentDto> getAllDocuments(@PathVariable String customer_id);

}
