package com.fabiola.portfolio_backend.model;

public class Profile {
    private String name;
    private String title;
    private String email;
    private String phone;
    private String city;
    private String linkedin;
    private String bio;

    public Profile() {
    }

    public Profile(String name, String title, String email, String phone, String city, String linkedin, String bio) {
        this.name = name;
        this.title = title;
        this.email = email;
        this.phone = phone;
        this.city = city;
        this.linkedin = linkedin;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public String getBio() {
        return bio;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}