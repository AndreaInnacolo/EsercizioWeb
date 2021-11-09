package com.company.EsercizioWeb.model;

public class Regular {
    private String email, password;
    private final Priority level = Priority.medium;

    public Regular(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Priority getLevel() {
        return level;
    }
    
}
