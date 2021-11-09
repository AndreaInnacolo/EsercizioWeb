package com.company.EsercizioWeb.model;

public class Administrator {
    private String email, password;
    private final Priority level = Priority.high;

    public Administrator(String email, String password) {
        this.email = email;
        this.password = password;
    }


}
