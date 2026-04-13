package com.fabiola.portfolio_backend.controller;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fabiola.portfolio_backend.model.Document;
import com.fabiola.portfolio_backend.service.DocumentService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class DocumentController {

    private final DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @GetMapping("/api/documents")
    public List<Document> getDocuments() {
        return documentService.getAllDocuments();
    }
}