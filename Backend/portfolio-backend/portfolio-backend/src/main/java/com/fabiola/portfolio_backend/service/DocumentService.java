package com.fabiola.portfolio_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fabiola.portfolio_backend.model.Document;

@Service
public class DocumentService {

    public List<Document> getAllDocuments() {
        return List.of(
                new Document(1L, "Lebenslauf", "PDF", "/documents/lebenslauf.pdf"),
                new Document(2L, "Zeugnis Praktikum", "PDF", "/documents/zeugnis-praktikum.pdf")
        );
    }
}