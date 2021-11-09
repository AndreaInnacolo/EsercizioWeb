package com.company.EsercizioWeb.model;

public class Guest {
    private String email, password;
    private final Priority level = Priority.low;

    public Guest(String email, String password) {
        this.email = email;
        this.password = password;
    }


}
