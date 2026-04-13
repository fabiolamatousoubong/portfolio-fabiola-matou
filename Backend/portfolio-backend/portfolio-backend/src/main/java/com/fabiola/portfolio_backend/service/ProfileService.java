package com.fabiola.portfolio_backend.service;

import org.springframework.stereotype.Service;

import com.fabiola.portfolio_backend.model.Profile;

@Service
public class ProfileService {

    public Profile getProfile() {
        return new Profile(
                "Matou Soubong Syntcha Fabiola",
                "Softwareentwicklerin",
                "fabiolamatou@gmail.com",
                "+49 178 8251276",
                "Berlin",
                "https://www.linkedin.com/in/syntcha-fabiola-matou-soubong/",
                "Motivierte Softwareentwicklerin mit Schwerpunkt auf Webentwicklung, modernen Technologien und Softwarequalität."
        );
    }
}