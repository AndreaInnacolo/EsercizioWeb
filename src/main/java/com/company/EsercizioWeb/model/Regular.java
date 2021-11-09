package com.company.EsercizioWeb.model;

public class Regular {
    private String email, password;
    private final Priority level = Priority.medium;

    public Regular(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
