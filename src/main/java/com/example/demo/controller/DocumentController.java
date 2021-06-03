package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.DocumentDto;
import com.example.demo.entites.Document;
import com.example.demo.service.DocumentService;

@RestController
@RequestMapping("api/v1/document")
public class DocumentController {
	@Autowired
	private DocumentService documentService;

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public DocumentDto saveDocument(@RequestBody DocumentDto documentdto, @PathVariable String customer_id) {
		return documentService.saveDocument(documentdto, customer_id);

	}

	@RequestMapping(value = "/{customer_id}/documents", method = RequestMethod.GET)
	public List<DocumentDto> getAllDocuments(@PathVariable String customer_id) {
		return documentService.getAllDocuments(customer_id);
	}

}
