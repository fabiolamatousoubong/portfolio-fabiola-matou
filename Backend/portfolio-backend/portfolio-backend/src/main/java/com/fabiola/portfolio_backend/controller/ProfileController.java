package com.fabiola.portfolio_backend.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fabiola.portfolio_backend.model.Profile;
import com.fabiola.portfolio_backend.service.ProfileService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/api/profile")
    public Profile getProfile() {
        return profileService.getProfile();
    }
}